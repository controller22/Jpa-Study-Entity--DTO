package com.example.site1.model.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.site1.model.user.entity.UserEntity;

public interface UserRepository extends JpaRepository <UserEntity,Integer> {   
}
