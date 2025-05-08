package com.interview.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.practice.dao.UserDao;
import com.interview.practice.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	/**
	 * 创建用户信息service实现
	 */
	public User createUser(User user) {
		return userDao.save(user);
	}

	/**
	 * 根据用户id查询用户信息service实现
	 */
	public User getUser(Long id) {
		return userDao.findById(id).get();
	}
}
