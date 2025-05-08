package com.interview.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.practice.entity.User;
import com.interview.practice.service.UserService;
import com.interview.practice.vo.UserIdVo;
import com.interview.practice.vo.UserVo;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 创建用户接口，返回用户id
	 * @param user
	 * @return
	 */
	@PostMapping
	public UserIdVo createUser(@RequestBody User user) {
		Long id = userService.createUser(user).getId();
		UserIdVo UserIdVo = new UserIdVo();
		UserIdVo.setId(id);
		return UserIdVo;
	}

	/**
	 * 根据用户id查询用户基本信息接口
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public UserVo queryUser(@PathVariable Long id) {
		User user = userService.getUser(id);
		BeanCopier beanCopier = BeanCopier.create(User.class, UserVo.class, false);
		UserVo userVo = new UserVo();
		beanCopier.copy(user, userVo, null);
		return userVo;
	}
}
