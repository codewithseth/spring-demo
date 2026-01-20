package com.codewithseth.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {

    private final UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create() {
        // TODO Auto-generated method stub
       System.out.println("Create user from service 1");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        System.out.println("Delete user from service 1");
    }
    
}
