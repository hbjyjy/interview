package com.interview.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interview.practice.entity.User;

/**
 * user DAO层，继承JpaRepository
 */
public interface UserDao extends JpaRepository<User, Long> {
}
