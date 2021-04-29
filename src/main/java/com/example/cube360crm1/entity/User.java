package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CRM_USERS")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long crmUserId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_FIRST_NAME")
    private String userFname;
    @Column(name = "USER_LAST_NAME")
    private String userLname;
    @Column(name = "USER_PASSWORD")
    private String password;
    @Column(name = "USER_EMAIL")
    private String userEmail;

}
