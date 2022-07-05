package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.Users;

import java.util.List;

public interface UsersService {

    Users saveUser(Users user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    Users getUser(String username);
    List<Users> getUsers();

}
