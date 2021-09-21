package me.yourfavoritesde.studentmanagementsystem.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder()
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="gpa")
    private Double gpa;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, Double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
    }
}
