package com.javav.service.impl;

import com.javav.entity.User;
import com.javav.repository.UserRepository;
import com.javav.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUserById(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User updateUser(User user) {
        User existedUser = userRepository.findById(user.getId()).get();
        existedUser.setFirstName(user.getFirstName());
        existedUser.setLastName(user.getLastName());
        existedUser.setEmail(user.getEmail());
        User updateUser = userRepository.save(existedUser);
        return updateUser;
    }
}
