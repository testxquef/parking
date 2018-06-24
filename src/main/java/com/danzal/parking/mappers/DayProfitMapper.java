package com.danzal.parking.mappers;


import com.danzal.parking.domain.DayProfit;
import com.danzal.parking.models.DayProfitDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DayProfitMapper {

    DayProfitMapper INSTANCE = Mappers.getMapper(DayProfitMapper.class);

    DayProfitDTO dayProfitToDayProfitDTO(DayProfit dayProfit);

    DayProfit dayProfitDTOToDayProfit(DayProfitDTO dayProfitDTO);
}
