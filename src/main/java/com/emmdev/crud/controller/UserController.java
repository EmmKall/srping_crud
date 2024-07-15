package com.emmdev.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.emmdev.crud.model.User;
import com.emmdev.crud.service.UserService;

@RestController
@RequestMapping( "/user" )
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping( "" )
    public List<User> index() {
        return userService.getAll();
    }

    @GetMapping( "/{id}" )
    public User findById(@PathVariable Long id ) {
        return userService.findBById( id );
    }
    

    @PostMapping( "" )
    public User store(@RequestBody User user ) {
        return userService.create( user );
    }

    @PutMapping( "/{id}" )
    public User update(@PathVariable Long id, @RequestBody User user ) {
        return userService.update( user, id );
    }

    @DeleteMapping( "/{id}" )
    public String destroy( @PathVariable Long id ) {
        userService.destroy( id );
        return new String( "Destroyed" );
    }
        

}
