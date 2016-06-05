package com.dive2sky.springboot.repositories;

import com.dive2sky.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
