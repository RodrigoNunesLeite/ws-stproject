package clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import clientes.model.entity.Cliente;
import clientes.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {
	/*
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository) {
		return args -> {
			Cliente cliente = Cliente.builder().cpf("12345678901").nome("Rodrigo").build();
			repository.save(cliente);
			
		};
	}
	*/
	public static void main(String[]args) {
		SpringApplication.run(ClientesApplication.class, args);
	}
}
