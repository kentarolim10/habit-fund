package org.example.backend.habit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.backend.common.BaseEntity;
import org.example.backend.user.User;

@Getter
@Setter
@Entity
public class Habit extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    private String color;

    private Integer amount;
}
