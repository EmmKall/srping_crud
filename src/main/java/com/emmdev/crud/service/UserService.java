package com.emmdev.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmdev.crud.model.User;
import com.emmdev.crud.repository.UserI;

@Service
public class UserService {

    @Autowired
    private UserI userI;

    public User create( User user ){
        return userI.save( user );
    }

    public List<User> getAll(){
        return userI.findAll();
    }

    public User findBById( Long id ){
        return userI.findById( id ).orElse( null );
    }

    public User update( User user, Long id ){
        user.setId( id ) ;
        return userI.save( user );
    }

    public void destroy( Long id ){
        userI.deleteById( id );
    }

}
