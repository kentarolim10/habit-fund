package org.example.backend.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.example.backend.common.Base_entity;

@Entity
public class Users extends Base_entity {

    private String oauthProvider;
    private String oauthProviderId;

    private Integer balance;
}
