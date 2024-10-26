package com.spark.dynamic.dynamic_query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getName());
    }


    @GetMapping("/criteria")
    public List<User> getUsersByCriteria(@RequestParam(required = false) String name) {
        return userService.findUsersByCriteria(name);
    }
}
