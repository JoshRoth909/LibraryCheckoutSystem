package com.labC.libraryCheckoutSystem;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService{
//    @Autowired
//    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

//    @Override
//    public User getUserByName(String name) {
//        return null;
//    }

//    @Override
//    public User getUserByEmail(String email) {
//        return null;
//    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);

    }

    @Override
    public Void removeUser(Long id) {
        return null;
    }
}
