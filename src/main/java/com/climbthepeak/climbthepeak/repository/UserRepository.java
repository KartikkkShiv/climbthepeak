package com.climbthepeak.climbthepeak.repository;

import com.climbthepeak.climbthepeak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
