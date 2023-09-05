package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SignupEntity;

public interface SignupRepo extends JpaRepository<SignupEntity, Integer> {

}
