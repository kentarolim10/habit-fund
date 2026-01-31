package org.example.backend.habit_transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.example.backend.common.BaseEntity;
import org.example.backend.habit.Habit;
import org.example.backend.user.User;

@Getter
@Setter
@Entity
public class HabitTransaction extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "habit_id")
    private Habit habit;
}
