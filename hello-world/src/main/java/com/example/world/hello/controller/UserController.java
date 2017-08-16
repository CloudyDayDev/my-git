package com.example.world.hello.controller;

import com.example.world.hello.model.User;
import com.example.world.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public ModelAndView showUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        List<User> userList = new ArrayList<>();
        userList = userService.findAll();
        modelAndView.addObject("userList", userList);
        return modelAndView ;
    }


}
