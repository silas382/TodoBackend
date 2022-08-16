package com.silas.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;

import java.util.Date;

@SpringBootApplication
public class TodoApplication  {


	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}



	//nextval('employees_id_seq'::regclass)

}
