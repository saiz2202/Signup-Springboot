package com.sathish.signup.repository;

import com.sathish.signup.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,String> {
}
