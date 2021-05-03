package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
public class CrmToken extends AbstractEntity {
    @Id
    private long tokenId;
    private String tokenStatus;
    private Timestamp expiredDate;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}
