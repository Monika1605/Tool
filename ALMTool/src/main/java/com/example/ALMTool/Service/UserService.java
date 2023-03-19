package com.example.ALMTool.Service;

import com.example.ALMTool.Entity.UserEntity;
import com.example.ALMTool.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

    public void addUsers(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
}