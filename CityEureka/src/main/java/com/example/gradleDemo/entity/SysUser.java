package com.example.gradleDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userName;

    private String password;

    private String email;

}
