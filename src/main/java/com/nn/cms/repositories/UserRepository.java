package com.nn.cms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nn.cms.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
