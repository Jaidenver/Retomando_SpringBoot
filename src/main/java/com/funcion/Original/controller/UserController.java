package com.funcion.Original.controller;

import com.funcion.Original.entity.User;
import com.funcion.Original.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping
    public ResponseEntity<List<User>> getall(){
        List<User> users = userService.getAll();
        if(users.isEmpty())
           return ResponseEntity.noContent().build();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        User user = userService.getUserById(id);
        if(user == null)
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        User usernew = userService.save(user);
        return ResponseEntity.ok(usernew);
    }
}
