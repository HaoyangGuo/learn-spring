package com.dhguo.myfancypdfinvoicesspringboot.service;

import com.dhguo.myfancypdfinvoicesspringboot.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {
    public User findById(String id) {
        String randomName = UUID.randomUUID().toString();
        // always "finds" the user, every user has a random name
        return new User(id, randomName);
    }
}
