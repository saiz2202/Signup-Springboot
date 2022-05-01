package com.sathish.signup.dao;

import com.sathish.signup.model.UserDetails;
import com.sathish.signup.repository.UserDetailsRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class CreateUsersDAO {
   @Autowired
   public UserDetailsRepository userRepo;
}
