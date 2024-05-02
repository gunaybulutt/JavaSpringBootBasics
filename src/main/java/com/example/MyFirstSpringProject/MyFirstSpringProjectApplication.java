package com.example.MyFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MyFirstSpringProjectApplication {

	//localhost:8080/api/hello
	//Get  		: Veri görüntülemek istediğimiz zaman kullanılıyor.
	//Post 		: Veri kaydetmek istediğimiz zaman kullanıyoruz.
	//PUT  		: Veri güncellemek için kullanıyoruz
	//PATCH 	: Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz(örn parola güncellemek)
	//Delete 	: Veri silmek istediğimiz zaman kullanıyoruz. 


	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
	}

}