package com.newstarlab.vaccinebooking.controller;

import com.newstarlab.vaccinebooking.mapper.VaccinumBookingMapper;
import com.newstarlab.vaccinebooking.pojo.VaccinumBooking;
import com.newstarlab.vaccinebooking.pojo.VaccinumBookingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: freedom
 * @Date: 2021-01-21 11:09
 **/
@RestController
public class AccinumBookingController {

    @Autowired
    VaccinumBookingMapper vaccinumBookingMapper;
    @Autowired
    VaccinumBookingExample vaccinumBookingExample;

    @CrossOrigin(origins = "http://localhost:8082")
    @GetMapping(value = "/findAll")
    public List<VaccinumBookingExample> findAll(){
        //① selectByPrimaryKey()

        VaccinumBooking user = vaccinumBookingMapper.selectByPrimaryKey("1"); //相当于select * from user where id = 100

//② selectByExample() 和 selectByExampleWithBLOGs()

        //vaccinumBookingExample example = new vaccinumBookingExample();
        VaccinumBookingExample.Criteria criteria = vaccinumBookingExample.createCriteria();
        criteria.andIdEqualTo("1");
                //.andUsernameEqualTo("wyw");
        //criteria.andUsernameIsNull();
        //vaccinumBookingExample.setOrderByClause("username asc,email desc");
        List<?>list = vaccinumBookingMapper.selectByExample(vaccinumBookingExample);


       return (List<VaccinumBookingExample>) list;
    }
}
