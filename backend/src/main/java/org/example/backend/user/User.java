package org.example.backend.user;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.example.backend.common.BaseEntity;

@Getter
@Setter
@Entity
public class User extends BaseEntity {

    private String oauthProvider;
    private String oauthProviderId;

    private Integer balance;
}
