package org.example.backend.user_settings;

import jakarta.persistence.*;
import org.example.backend.common.Base_entity;
import org.example.backend.users.Users;

@Entity
public class User_settings extends Base_entity {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;

    private String currency;
}
