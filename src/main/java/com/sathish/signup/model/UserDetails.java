package com.sathish.signup.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="userdetails")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDetails {

    @Id
    public String id;
    @NonNull
    public String name;
    public @NonNull  int age;
    public @NonNull String email;
    public @NonNull char sex;
    public Date dob;
    public @NonNull String username;
    public @NonNull String password;

}
