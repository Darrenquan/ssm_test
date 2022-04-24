package com.neu.ssm.repository;

import com.neu.ssm.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}
