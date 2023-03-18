package com.springboot.api.httpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
@SpringBootApplication
public class HttpapiApplication {

	@Autowired
	DataSource dataSource;

	private final Logger LOGGER = LogManager.getLogger(this.getClass());

	@GetMapping("/live")
	public String checkDBStatus (){
		try {
			LOGGER.info("Database Connection establish...");
			Connection connection = dataSource.getConnection();
			LOGGER.info("Database Connection established.");
			return "Well done";
		} catch (SQLException e) {
			LOGGER.debug("Database Connection issue...");
			return "Maintenance";
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(HttpapiApplication.class, args);
	}

}
