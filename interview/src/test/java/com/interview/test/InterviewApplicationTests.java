package com.interview.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.interview.practice.entity.User;
import com.interview.practice.service.UserService;

/**
 * user service的Test类
 */
@SpringBootTest
class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	void createUser_shouldReturnId() {
		User user = new User();
		user.setName("Tom");
		user.setBirth("2025-01-01");
		user.setGender("male");
		user.setRole("user");
		Long id = userService.createUser(user).getId();

		assertEquals(1L, id);
	}

	@Test
	void getUser_shouldReturnUser() {
		User user = userService.getUser(1L);

		assertEquals("Tom", user.getName());
	}
}
