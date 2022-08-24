package com.example.martinerasmus_prg381_project.student.register;

import com.example.martinerasmus_prg381_project.user;

import javax.persistence.*;

@Entity
@Table(name = "Register")
public class Register implements user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long register_id;

    @Column(name = "student_email", nullable = false, unique = true, length = 45)
    private String student_email;

    @Column(name = "student_password",nullable = false, length = 64)
    private String student_password;

    @Column(name = "student_name", nullable = false, length = 20)
    private String student_name;

    @Column(name = "student_address", nullable = false, length = 20)
    private String student_address;

    @Column(name = "course_name", nullable = false, length = 20)
    private String course_name;

    public Long getRegister_id() {
        return register_id;
    }

    public void setRegister_id(Long register_id) {
        this.register_id = register_id;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}

