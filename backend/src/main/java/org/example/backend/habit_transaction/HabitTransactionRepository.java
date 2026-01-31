package org.example.backend.habit_transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitTransactionRepository extends JpaRepository<HabitTransaction,Long> {
}
