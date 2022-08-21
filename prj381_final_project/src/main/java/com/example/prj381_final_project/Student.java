package com.example.prj381_final_project;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
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

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long student_id;

        @Column(name = "student_email", nullable = false, unique = true, length = 45)
        private String student_email;

        @Column(name = "student_password",nullable = false, length = 64)
        private String student_password;

        @Column(name = "student_name", nullable = false, length = 20)
        private String student_name;

        @Column(name = "student_address", nullable = false, length = 20)
        private String student_address;
    }

