package com.makler.platform.controller;

import com.makler.platform.model.Users;
import com.makler.platform.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@AllArgsConstructor
@RequestMapping("/users")
public class Controller {

    private final IUserService userService;

    @GetMapping("/getUsers")
    public List<Users> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody Users users) {
        userService.addUser(users);
    }
    //example curl -X POST -H "Content-Type: application/json" -d "{\"name\":\"test\",\"email\":\"test\",\"password\":\"test\",\"phone\":1234567890}" http://localhost:8080/users/addUser

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody Users users) {
        userService.deleteUser(users);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody Users users) {
        userService.updateUser(users);
    }

    @PostMapping("/getUserById")
    public Users getUserById(@RequestBody Users users) {
        return userService.getUserById(users.getId());
    }

    @PostMapping("/getUserByName")
    public List<Users> getUserByName(@RequestBody Users users) {
        return userService.getUserByName(users.getName());
    }

    @PostMapping("/getUserByEmail")
    public Users getUserByEmail(@RequestBody Users users) {
        return userService.getUserByEmail(users.getEmail());
    }

    @PostMapping("/getUserByPhone")
    public Users getUserByPhone(@RequestBody Users users) {
        return userService.getUserByPhone(users.getPhone());
    }
}
