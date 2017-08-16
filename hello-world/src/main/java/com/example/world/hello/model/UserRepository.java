package com.example.world.hello.model;

import com.example.world.hello.model.User;
import com.example.world.hello.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserRepository {

    private UserMapper userMapper;

    @Autowired
    public UserRepository(UserMapper mapper){
     this.userMapper = mapper;
    }

    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        String name = "Mrs. Test";
        for (int j = 0 ; j < 10 ; j++){
            User user = new User();
            user.setId(j);
            user.setName(name + " " + j);
            user.setRegisteredDate(new Date());
            users.add(user);
        }

        return users;
    }
}
