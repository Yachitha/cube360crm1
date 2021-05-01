package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class UserAccess extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAccessId;
    private Long userId;
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date lastLoginDate;
}
