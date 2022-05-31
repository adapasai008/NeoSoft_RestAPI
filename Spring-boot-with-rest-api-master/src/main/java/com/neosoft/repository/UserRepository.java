package com.neosoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity,Integer> {

	List<UserEntity> findAllById();



}
