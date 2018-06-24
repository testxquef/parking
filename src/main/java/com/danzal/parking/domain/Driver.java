package com.danzal.parking.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DriverType driverType;
    private Currency currency = Currency.PLN;
    private boolean ticket_active = false;
    private String startTime;
    private String stopTime;
    private float amountToPay;

    private String transactionDay;


}
