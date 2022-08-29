package com.example.prg381_final_project;

import com.example.prg381_final_project.student.register.Register;
import com.example.prg381_final_project.student.register.RegisterRepository;
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
public class RegisterRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RegisterRepository repo;

    @Test
    public void testCreateUser() {
        Register register1 = new Register();
        register1.setStudent_email("99@gmail.com");
        register1.setStudent_password("1234");
        register1.setStudent_name("Steve");
        register1.setStudent_address("15 Fourth ");
        register1.setCourse_name("PRG381");

        Register savedUser = repo.save(register1);

        Register existUser = entityManager.find(Register.class, savedUser.getRegister_id());

        assertThat(register1.getRegister_id()).isEqualTo(existUser.getRegister_id());

    }
}