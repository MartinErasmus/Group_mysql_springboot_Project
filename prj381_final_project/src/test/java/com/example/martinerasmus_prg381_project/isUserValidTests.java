package com.example.martinerasmus_prg381_project;

import com.example.martinerasmus_prg381_project.student.Student;
import com.example.martinerasmus_prg381_project.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class isUserValidTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StudentRepository repo;

    @Test
    public void testFindUserByEmail(){
        String email ="martinerasmus99@gmail.com";
        Student student = repo.findByEmail(email);

        assertThat(student).isNotNull();
    }
}