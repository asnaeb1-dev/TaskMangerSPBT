package com.example.taskmanager.DAL;

import com.example.taskmanager.Model.User;

import java.util.List;

public interface UserDAL {

    List<User> getAllUsers();
    User createUser(User user);
    User removeUser(User user);
    void removeAllUsers();
    User getUserByID(String id);
}
