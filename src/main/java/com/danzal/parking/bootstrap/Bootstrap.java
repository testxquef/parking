package com.danzal.parking.bootstrap;

import com.danzal.parking.domain.DayProfit;
import com.danzal.parking.domain.Driver;
import com.danzal.parking.domain.DriverType;
import com.danzal.parking.repositories.DayProfitRepository;
import com.danzal.parking.repositories.DriverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner{

    private final DriverRepository driverRepository;
    private final DayProfitRepository dayProfitRepository;


    public Bootstrap(DriverRepository driverRepository, DayProfitRepository dayProfitRepository) {
        this.driverRepository = driverRepository;
        this.dayProfitRepository = dayProfitRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadDrivers();
        loadDays();
    }

    private void loadDrivers(){
        Driver driver1 = new Driver();
        driver1.setId(1l);
        driverRepository.save(driver1);

        Driver driver2 = new Driver();
        driver2.setTicket_active(false);
        driverRepository.save(driver2);

        Driver driver3 = new Driver();
        driver3.setDriverType(DriverType.VIP);
        driverRepository.save(driver3);
    }

    private void loadDays(){
        DayProfit dayProfit = new DayProfit();
        dayProfit.setDate("2018/06/22");
        dayProfitRepository.save(dayProfit);
    }
}
