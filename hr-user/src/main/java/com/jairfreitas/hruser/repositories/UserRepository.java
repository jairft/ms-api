package com.jairfreitas.hruser.repositories;

import com.jairfreitas.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
