package com.codewithseth.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("userServiceImpl2") UserService userService) {
        this.userService = userService;
    }

    public void createUser() {
        userService.create();
    }

    public void deleteUser() {
        userService.delete();
    }
}
