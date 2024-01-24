package com.shyamalmadura.spring.ssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @GetMapping("/user")
//    String getUser(Principal principal){
//        UserDetails currentUser = (UserDetails) ((Authentication) principal).getPrincipal();
//        return "username: " + currentUser.getUsername();
//    }

    @GetMapping("/user")
    String getUser(){
        return "username from SSL";
    }
}