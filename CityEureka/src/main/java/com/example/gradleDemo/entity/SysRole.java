package com.example.gradleDemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysRole {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String roleName;

    private String roleType;
}
