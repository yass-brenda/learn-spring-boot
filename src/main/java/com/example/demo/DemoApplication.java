package com.example.demo;

import jdk.dynalink.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		// Lo que hace spring internamente
		Class clase = DemoApplication.class;
		Method [] arr = clase.getMethods();
		for(Method m :  arr){
			System.out.println(m.getName());
			for (Parameter p : m.getParameters()){
				try {
					DemoApplication d = new
							DemoApplication();
					System.out.println((DemoApplication.class.getMethod("bookDefault",String.class).invoke(d,"brenda")));
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				System.out.println();

			}
		}
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/index")
	public String hola(){
		return "index";
	}

	@PostMapping("/api/v1/books")
	public String hola2(){
		return "libro guardado";
	}

	@PostMapping("/api/v1/books/default")
	public String bookDefault(String name){
		System.out.println("Es el valor del name"+ name);
		return name;
	}

}
