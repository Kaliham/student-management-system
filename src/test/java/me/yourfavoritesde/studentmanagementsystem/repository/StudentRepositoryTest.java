package me.yourfavoritesde.studentmanagementsystem.repository;

import me.yourfavoritesde.studentmanagementsystem.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;



    @Test
    void insertStudent() {
        Student expected = Student.builder()
                .firstName("Name")
                .lastName("LastName")
                .email("email@email.com")
                .gpa(4.0).build();
        Student actual = studentRepository.save(expected);
        studentRepository.findById(expected.getId());
        assertEquals(expected,actual);
        System.out.println("expected : "+expected);System.out.println("actual : "+actual);
    }
}