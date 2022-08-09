package com.example.demo;

import jdk.dynalink.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		// Lo que hace spring internamente
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/index2")
	public @ResponseBody ArrayList<Integer> hola(){
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		return array;
	}

	@GetMapping("/api/v1/books")
	public Integer hola2(@RequestParam(value = "cantidad",defaultValue = "1") Integer numero){
		return 1 + numero;
	}

	@GetMapping("/api/v1/books/default") // Para cuando no se tenha idea que parametros vienen da todos en una sola variable
	public Map<String,String> bookDefault(@RequestParam Map<String,String> name){
		System.out.println("Es el valor del name"+ name);
		return name;
	}

}
