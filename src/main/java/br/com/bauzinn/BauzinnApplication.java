package br.com.bauzinn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

import br.com.bauzinn.controller.UsuarioController;
import br.com.bauzinn.dao.UsuarioDaoImpl;
import br.com.bauzinn.model.Usuario;
import br.com.bauzinn.service.UsuarioServiceImpl;
@Configuration
@SpringBootApplication
@ComponentScan(basePackageClasses = UsuarioController.class)
public class BauzinnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BauzinnApplication.class, args);
	}
	
	
	@Bean
	public UsuarioServiceImpl usuarioServiceImpl(){
	
	return new UsuarioServiceImpl();
	}
	
	@Bean	
	public UsuarioDaoImpl usuariodaoImpl(){
		
	return new UsuarioDaoImpl();
	}
		
}
