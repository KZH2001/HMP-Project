package com.project.HMP.Entity;

import org.hibernate.boot.models.annotations.spi.ColumnDetails;

import Enum.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}