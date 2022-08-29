package com.example.prg381_final_project.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {

        @Query("SELECT u FROM Student u WHERE u.student_email= ?1")
        Student findByEmail(String email);



}