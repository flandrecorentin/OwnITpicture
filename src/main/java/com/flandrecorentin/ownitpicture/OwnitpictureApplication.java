package com.flandrecorentin.ownitpicture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OwnitpictureApplication {

	public static void main(String[] args) {
		System.out.println("***** Début main OwnITpicture");
		System.out.println("mise en place de la page d'accueuil");
		SpringApplication.run(OwnitpictureApplication.class, args);
		System.out.println("***** Fin main OwnITpicture");
	}

}
