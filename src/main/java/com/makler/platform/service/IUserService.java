package com.makler.platform.service;

import com.makler.platform.model.Users;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    List<Users> getUsers();
    void addUser(Users users);
    void deleteUser(Users users);
    void updateUser(Users users);
    Users getUserById(UUID id);
    List<Users> getUserByName(String name);
    Users getUserByEmail(String email);
    Users getUserByPhone(Long phone);

}
