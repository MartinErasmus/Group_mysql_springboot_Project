package com.example.prg381_final_project;

import com.example.prg381_final_project.admin.Admin;
import com.example.prg381_final_project.admin.AdminRepository;
import com.example.prg381_final_project.userFactory.userFactory;
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
public class AdminRepositoryFactoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AdminRepository repo;

    @Test
    public void testCreateUser() {
        userFactory userFactory = new userFactory();
        Admin admin2 = (Admin) userFactory.createUser("Admin");

        admin2.setAdmin_name("ma99");
        admin2.setContact("0811119965");
        admin2.setPassword("54321");

        Admin savedUser = repo.save(admin2);

        Admin existUser = entityManager.find(Admin.class, savedUser.getAdmin_id());

        assertThat(admin2.getAdmin_id()).isEqualTo(existUser.getAdmin_id());

    }
}