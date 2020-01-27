package com.oldwest.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oldwest.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
