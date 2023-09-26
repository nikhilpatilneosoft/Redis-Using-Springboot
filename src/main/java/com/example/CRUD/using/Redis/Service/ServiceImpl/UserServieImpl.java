package com.example.CRUD.using.Redis.Service.ServiceImpl;

import com.example.CRUD.using.Redis.Model.User;
import com.example.CRUD.using.Redis.Repositories.UserRepository;
import com.example.CRUD.using.Redis.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User updateUser(User user, int id) {
        User savedUser = userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));
        savedUser.setName(user.getName());
        savedUser.setAge(user.getAge());
        return userRepository.save(savedUser);
    }

    @Override
    public String deleteUser(int id) {
        User savedUser = userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.deleteById(id);
        return "User deleted";
    }
}
