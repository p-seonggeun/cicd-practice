package com.example.cicd.domain.user.repository;

import com.example.cicd.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
