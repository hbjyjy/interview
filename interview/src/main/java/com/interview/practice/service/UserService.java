package com.interview.practice.service;

import com.interview.practice.entity.User;

public interface UserService {

	/**
	 * 创建用户service
	 * @param user
	 * @return
	 */
	public User createUser(User user);

	/**
	 * 根据id查询用户信息service
	 * @param id
	 * @return
	 */
	public User getUser(Long id);

}
