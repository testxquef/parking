package com.danzal.parking.mappers;

import com.danzal.parking.models.DriverDTO;
import com.danzal.parking.domain.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface DriverMapper {

    DriverMapper INSTANCE = Mappers.getMapper(DriverMapper.class);

    DriverDTO driverToDriverDTO(Driver driver);

    Driver driverDTOToDriver(DriverDTO driverDTO);

}
