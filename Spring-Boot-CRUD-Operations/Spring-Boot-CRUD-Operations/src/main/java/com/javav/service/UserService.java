package com.javav.service;

import com.javav.entity.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public User getUserById(Long id);

    public List<User> getAllUsers();

    public User updateUser(User user);

    public void deleteUser(Long id);
}
