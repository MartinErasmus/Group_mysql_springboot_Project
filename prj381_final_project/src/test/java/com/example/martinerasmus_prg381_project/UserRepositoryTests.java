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
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StudentRepository repo;

    @Test
    public void testCreateUser() {
        Student martin = new Student();
        martin.setStudent_email("martinerasmus99@gmail.com");
        martin.setStudent_password("1234");
        martin.setStudent_name("Test Erasmus");
        martin.setStudent_address("15 Fourth Rd Bredell");

        Student savedUser = repo.save(martin);

        Student existUser = entityManager.find(Student.class, savedUser.getStudent_id());

        assertThat(martin.getStudent_email()).isEqualTo(existUser.getStudent_email());

    }
}