package com.makler.platform.service;

import com.makler.platform.dao.IUserRepository;
import com.makler.platform.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor

public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(Users users) {
        userRepository.save(users);
    }

    @Override
    public void deleteUser(Users users) {
        userRepository.delete(users);
    }

    @Override
    public void updateUser(Users users) {
        userRepository.save(users);
    }

    @Override
    public Users getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<Users> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Users getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Users getUserByPhone(Long phone) {
        return userRepository.findByPhone(phone);
    }
}
