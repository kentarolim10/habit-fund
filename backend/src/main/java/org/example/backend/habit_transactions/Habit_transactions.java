package org.example.backend.habit_transactions;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.backend.common.Base_entity;
import org.example.backend.habits.Habits;
import org.example.backend.users.Users;

@Entity
public class Habit_transactions extends Base_entity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "habit_id")
    private Habits habit;
}
