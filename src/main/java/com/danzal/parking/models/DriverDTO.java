package com.danzal.parking.models;


import com.danzal.parking.domain.Currency;
import com.danzal.parking.domain.DriverType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {

    private boolean ticket_active;
    private String startTime;
    private String stopTime;
    private float amountToPay;
    private DriverType driverType;
    private Currency currency = Currency.PLN;

    private String transactionDay;

    @JsonProperty("driver_url")
    private String driverUrl;
}
