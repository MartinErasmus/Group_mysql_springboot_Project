package com.example.prg381_final_project.studentLogin;

import com.example.prg381_final_project.student.Student;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class studentLogin implements UserDetails {

    private Student student;

    public studentLogin(Student student) {
        this.student = student;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return student.getStudent_password();
    }

    @Override
    public String getUsername() {
        return student.getStudent_email();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}