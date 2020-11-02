package com.labC.libraryCheckoutSystem;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

          
            @Autowired
        UserRepo userRepo;


    public void saveUser(String firstname, String lastname){
            userRepo.save(new user(firstname,lastname));
        }

//        public List<User> getAllUser(){
//            return userRepo.findAll();
//        }


}
