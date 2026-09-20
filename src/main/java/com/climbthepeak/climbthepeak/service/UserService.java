package com.climbthepeak.climbthepeak.service;

import com.climbthepeak.climbthepeak.entity.User;
import com.climbthepeak.climbthepeak.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   private final UserRepository userRepository;   // Always at the constructor injection make the variable as a final;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public List<User> getallusers() {
      return  userRepository.findAll();
    }
}
