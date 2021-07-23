package com.example.taskmanager.Controller;

import com.example.taskmanager.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(){
        return "Welcome Home!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUserlist();
    }

    @PostMapping(path = "/users/create", consumes = "application/json")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public User getUserByID(@RequestParam("id") String id){
        return userService.getUserByID(id);
    }

    @DeleteMapping(path = "/users/remove")
    public User removeUser(@PathVariable String username){
        return userService.removeUser(username);
    }

    @DeleteMapping(path = "/users/delete/all")
    public void removeAllUsers(){
        userService.removeAllUsers();
    }
}
