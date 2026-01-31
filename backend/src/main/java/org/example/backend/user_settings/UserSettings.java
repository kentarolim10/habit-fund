package org.example.backend.user_settings;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.backend.common.BaseEntity;
import org.example.backend.user.User;

@Getter
@Setter
@Entity
public class UserSettings extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String currency;
}
