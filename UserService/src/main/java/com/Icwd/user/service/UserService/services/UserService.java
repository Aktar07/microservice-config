package com.Icwd.user.service.UserService.services;

import com.Icwd.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

    // void deleteUser(User user);

    // User updateUser(User user, String userId);
}
