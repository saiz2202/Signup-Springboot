package com.sathish.signup.controller;


import com.sathish.signup.model.UserDetails;
import com.sathish.signup.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateUserController {

    @Autowired
    public UserDetailsRepository userRepo;

    @PostMapping(value = "/createuser")
    public UserDetails createUser(@RequestBody UserDetails user){
        UserDetails userdetails = new UserDetails();
        userdetails.setId(user.getId());
        userdetails.setName(user.getName());
        userdetails.setUsername(user.getUsername());
        userdetails.setPassword(user.getPassword());
        userdetails.setEmail(user.getEmail());
        userdetails.setSex(user.getSex());
        userdetails.setDob(user.getDob());
        return userRepo.save(userdetails);

    }
}
