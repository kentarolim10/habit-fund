package org.example.backend.transaction;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.backend.common.BaseEntity;
import org.example.backend.user.User;

@Getter
@Setter
@Entity
public class Transaction extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Integer amount;

}
