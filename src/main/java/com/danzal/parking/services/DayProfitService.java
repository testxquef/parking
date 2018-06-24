package com.danzal.parking.services;

import com.danzal.parking.domain.Currency;
import com.danzal.parking.models.DayProfitDTO;

public interface DayProfitService {


    DayProfitDTO getProfitDayInfo(String date);
    float checkDayProfit(String date);
    Currency getDayProfitCurrency(String date);
    void saveOrUpdateDayProfit(String date);
}
