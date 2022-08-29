package com.example.prg381_final_project;

import com.example.prg381_final_project.admin.Admin;
import com.example.prg381_final_project.admin.AdminRepository;
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
public class AdminRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AdminRepository repo;

    @Test
    public void testCreateUser() {
        Admin admin1 = new Admin();
        admin1.setAdmin_name("martinerasmus99");
        admin1.setContact("0817219965");
        admin1.setPassword("12345");

        Admin savedUser = repo.save(admin1);

        Admin existUser = entityManager.find(Admin.class, savedUser.getAdmin_id());

        assertThat(admin1.getAdmin_id()).isEqualTo(existUser.getAdmin_id());

    }
}