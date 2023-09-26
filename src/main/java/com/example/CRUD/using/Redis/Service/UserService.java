package com.example.CRUD.using.Redis.Service;

import com.example.CRUD.using.Redis.Model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUser(int id);

    List<User> getAllUsers();

    User updateUser(User user, int id);

    String deleteUser(int id);
}
