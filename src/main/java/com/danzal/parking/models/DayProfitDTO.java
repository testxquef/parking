package com.danzal.parking.models;


import com.danzal.parking.domain.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DayProfitDTO {

    private float profit;
    private String date;
    private Currency currency = Currency.PLN;

    @JsonProperty("day_url")
    private String dayUrl;
}