package br.com.curso.chicohfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChicohfoodApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChicohfoodApplication.class, args);
		System.out.println("Oi, Estou rodando com Spring boot!");
	}

}
