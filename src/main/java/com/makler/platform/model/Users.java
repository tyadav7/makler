package com.makler.platform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Users {

    //Autogenerate UUID
    @GeneratedValue(generator = "UUID")
    @Id
    private UUID id;
    private String name;
    private String email;
    private String password;
    private Long phone;
}
