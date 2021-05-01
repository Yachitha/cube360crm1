package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class CustomerAccess extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerAccessId;
    private Long customerId;
    private String customerName;
    @Temporal(TemporalType.DATE)
    private Date lastLoginDate;
}
