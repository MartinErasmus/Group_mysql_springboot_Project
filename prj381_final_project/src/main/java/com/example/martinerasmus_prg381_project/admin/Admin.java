package com.example.martinerasmus_prg381_project.admin;

import com.example.martinerasmus_prg381_project.user;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin implements user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admin_id;

    @Column(name = "password",nullable = false, length = 64)
    private String password;

    @Column(name = "admin_name", nullable = false, length = 20)
    private String admin_name;

    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Column(name = "contact", nullable = false, length = 20)
    private String contact;
}

