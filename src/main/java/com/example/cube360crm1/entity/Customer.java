package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Customer extends AbstractEntity {
    @Id
    private long customerId;
    @Column(unique = true)
    private String nic;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    @Temporal(TemporalType.DATE)
    private Date lastEditDateTime;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String customerStatus;
    private String mobileNumber;
    private String homePhone;
    private String street;
    private String city;
}
