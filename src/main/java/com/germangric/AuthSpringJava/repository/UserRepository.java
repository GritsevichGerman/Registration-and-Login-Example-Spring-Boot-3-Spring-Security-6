package com.germangric.AuthSpringJava.repository;


import com.germangric.AuthSpringJava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}