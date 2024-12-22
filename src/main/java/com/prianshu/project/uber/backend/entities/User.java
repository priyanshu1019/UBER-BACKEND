package com.prianshu.project.uber.backend.entities;

import com.prianshu.project.uber.backend.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
// postgres has a User table already in their db so changes the name
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    // this annotation creates a table especially for this set joins with the entity
    // table
    @Enumerated(EnumType.STRING)
    // This annotation specifies how the enum values in the Role collection will be
    // stored in the database.
    private Set<Role> roles;
}
