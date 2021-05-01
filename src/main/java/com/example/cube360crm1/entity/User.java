package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CRM_USERS")
@Getter
@Setter
public class User extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crmUserId;
    private String userName;
    private String userFirstname;
    private String userLastname;
    private String userPassword;
    private String userEmail;

}
