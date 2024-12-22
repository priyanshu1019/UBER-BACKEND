package com.prianshu.project.uber.backend.dto;

import java.util.Set;

import com.prianshu.project.uber.backend.entities.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private Set<Role> roles;
}
