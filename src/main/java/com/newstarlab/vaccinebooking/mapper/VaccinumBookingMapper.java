package com.newstarlab.vaccinebooking.mapper;

import com.newstarlab.vaccinebooking.pojo.VaccinumBooking;
import com.newstarlab.vaccinebooking.pojo.VaccinumBookingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface VaccinumBookingMapper {
    long countByExample(VaccinumBookingExample example);

    int deleteByExample(VaccinumBookingExample example);

    int deleteByPrimaryKey(String id);

    int insert(VaccinumBooking record);

    int insertSelective(VaccinumBooking record);

    List<VaccinumBooking> selectByExample(VaccinumBookingExample example);

    VaccinumBooking selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VaccinumBooking record, @Param("example") VaccinumBookingExample example);

    int updateByExample(@Param("record") VaccinumBooking record, @Param("example") VaccinumBookingExample example);

    int updateByPrimaryKeySelective(VaccinumBooking record);

    int updateByPrimaryKey(VaccinumBooking record);
}