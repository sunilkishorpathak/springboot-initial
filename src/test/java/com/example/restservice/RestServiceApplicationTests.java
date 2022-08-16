package com.example.restservice;

import com.example.controller.StudentHandler;
import com.example.entity.Student;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class RestServiceApplicationTests {
	//@LocalServerPort
	//private int port;

	//@Autowired
	//private StudentHandler studentHandler;

	//@Autowired
	//private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAddEmployee() {
		//Student student = new Student(1L, "rollno1", "Prakash");
		//ResponseEntity<String> responseEntity = this.restTemplate
	//			.postForEntity("http://localhost:" + port + "/employees", student, String.class);
//		assertEquals(201, responseEntity.getStatusCodeValue());
	}
}
