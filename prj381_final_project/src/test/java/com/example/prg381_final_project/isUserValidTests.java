package com.example.prg381_final_project;

import com.example.prg381_final_project.student.Student;
import com.example.prg381_final_project.student.StudentRepository;
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