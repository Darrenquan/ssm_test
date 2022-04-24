package com.neu.ssm.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Integer age;
    private String email;

}
