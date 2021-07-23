package com.example.taskmanager.DAL;

import com.example.taskmanager.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDALImpl implements UserDAL{

    @Autowired
    private UserRepository userRepository;

    public UserDALImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println(userRepository.findAll().toString());
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User removeUser(User user) {
        userRepository.delete(user);
        return user;
    }

    @Override
    public void removeAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public User getUserByID(String id) {
        Optional<User> user=  userRepository.findById(id);
        return user;
    }

}
