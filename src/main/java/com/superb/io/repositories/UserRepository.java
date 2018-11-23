package com.superb.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.superb.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
}
