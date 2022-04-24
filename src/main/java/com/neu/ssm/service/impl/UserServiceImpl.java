package com.neu.ssm.service.impl;

import com.neu.ssm.entity.User;
import com.neu.ssm.repository.UserRepository;
import com.neu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }
}
