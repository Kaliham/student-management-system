package me.yourfavoritesde.studentmanagementsystem.repository;

import me.yourfavoritesde.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
