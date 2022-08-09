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
@RestController
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		// Lo que hace spring internamente
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/index2")
	public String[] hola(){
		String[] array = {"a","b","c","d"};
		return array;
	}

	@GetMapping("/api/v1/books")
	public int hola2(){
		return 7;
	}

	@PostMapping("/api/v1/books/default")
	public String bookDefault(String name){
		System.out.println("Es el valor del name"+ name);
		return name;
	}

}
