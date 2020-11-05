package com.labC.libraryCheckoutSystem;


import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface  UserService {
    
   Optional<User> getUserById(Long id);
   User getUserByName(String name);
   User getUserByEmail(String email);
   void saveUser(User user);
   Void removeUser(Long id);


}
