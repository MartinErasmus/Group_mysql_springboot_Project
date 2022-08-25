package com.example.martinerasmus_prg381_project.studentLogin;

import com.example.martinerasmus_prg381_project.student.Student;
import com.example.martinerasmus_prg381_project.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class studentLoginService implements UserDetailsService {

    @Autowired
    private StudentRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = repo.findByEmail(username);
        if (student== null){
            throw new UsernameNotFoundException("No Student found");
        }
        return  new studentLogin(student);
    }
}
