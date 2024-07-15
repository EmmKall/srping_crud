package com.emmdev.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table( name = "users" )
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Getter
    @Setter
    private Long id;
    
    @Column( name = "name" )
    @Getter
    @Setter
    private String name;
    
    @Column( name = "email" )
    @Getter
    @Setter
    private String email;
    
    @Column( name = "password" )
    @Getter
    @Setter
    private String password;
    
    @Column( name =  "phone" )
    @Getter
    @Setter
    private String phone;


}
