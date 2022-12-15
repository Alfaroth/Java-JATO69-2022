package com.dave;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dave.dal.ConsegnaDAO;

@SpringBootTest
class SpringBabbiSacchiApplicationTests {
	
	@Autowired
	ConsegnaDAO repo;
	
	@Test
	void contextLoads() {
		
		String[] list = repo.getBimbiDoniSacchi();
		
		System.out.println(list[0]);
		System.out.println(".......................");
		
	}

}
