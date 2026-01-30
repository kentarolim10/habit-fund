package org.example.backend.transactions;

import jakarta.persistence.*;
import org.example.backend.common.Base_entity;
import org.example.backend.users.Users;

@Entity
public class Transactions extends Base_entity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private Integer amount;

}
