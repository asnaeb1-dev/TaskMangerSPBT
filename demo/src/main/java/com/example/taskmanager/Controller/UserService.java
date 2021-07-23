package com.example.taskmanager.Controller;

import com.example.taskmanager.DAL.UserDAL;
import com.example.taskmanager.DAL.UserDALImpl;
import com.example.taskmanager.DAL.UserRepository;
import com.example.taskmanager.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDALImpl userDAL;

    public UserService(UserDALImpl userDAL) {
        this.userDAL = userDAL;
    }

    public List<User> getUserlist(){
        return userDAL.getAllUsers();
    }

    //create a new user
    public User createUser(User user){
        userDAL.createUser(user);
        return user;
    }

    //remove a user
    public User removeUser(String username){
        List<User> users = userDAL.getAllUsers();
        for(User user : users){
            if(user.getUsername().equals(username)){
                return userDAL.removeUser(user);
            }
        }
        return null;
    }

    public void removeAllUsers(){
        userDAL.removeAllUsers();
    }

    public User getUserByID(String id) {
        return userDAL.getUserByID(id);
    }
}
