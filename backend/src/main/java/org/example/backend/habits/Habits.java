package org.example.backend.habits;

import jakarta.persistence.*;
import org.example.backend.common.Base_entity;
import org.example.backend.users.Users;

@Entity
public class Habits extends Base_entity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private String name;

    private String color;

    private Integer amount;
}
