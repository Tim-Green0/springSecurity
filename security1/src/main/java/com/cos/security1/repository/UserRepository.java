package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.dto.User;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository가 없어도 Ioc가 됨. 이유는 JpaRepository를 상속했기에
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
