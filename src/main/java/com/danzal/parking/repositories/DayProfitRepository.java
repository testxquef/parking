package com.danzal.parking.repositories;


import com.danzal.parking.domain.DayProfit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DayProfitRepository extends JpaRepository<DayProfit,Long>{

    Optional<DayProfit> findByDate(String date);
}
