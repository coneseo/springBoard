package com.springboard.board.controller;

import com.springboard.board.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
}
