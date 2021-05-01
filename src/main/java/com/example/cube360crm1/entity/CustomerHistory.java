package com.example.cube360crm1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class CustomerHistory extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerHistoryId;
    @Temporal(TemporalType.TIME)
    private Date visitTime;
    private String visitToken;
    private long taskId;
    @Temporal(TemporalType.TIME)
    private Date departureTime;
}
