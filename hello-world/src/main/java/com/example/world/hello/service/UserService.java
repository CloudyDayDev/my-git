package com.example.world.hello.service;

import com.example.world.hello.model.User;
import com.example.world.hello.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

}
