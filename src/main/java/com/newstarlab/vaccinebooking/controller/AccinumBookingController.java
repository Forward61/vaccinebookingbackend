package com.newstarlab.vaccinebooking.controller;

import com.newstarlab.vaccinebooking.mapper.VaccinumBookingMapper;
import com.newstarlab.vaccinebooking.pojo.VaccinumBooking;
import com.newstarlab.vaccinebooking.pojo.VaccinumBookingExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: freedom
 * @Date: 2021-01-21 11:09
 **/
@CrossOrigin
@RestController
public class AccinumBookingController {

    @Autowired
    VaccinumBookingMapper vaccinumBookingMapper;
    @Autowired
    VaccinumBookingExample vaccinumBookingExample;
    //@CrossOrigin(origins = "http://localhost:8082")

    //@CrossOrigin(origins = "http://localhost:8082")
    @RequestMapping(value = "/vb/findAll")
    public List<VaccinumBookingExample> findAll(VaccinumBooking vaccinumBooking){

        VaccinumBookingExample.Criteria criteria = vaccinumBookingExample.createCriteria();

        if(StringUtils.isNotBlank(vaccinumBooking.getName())){
            //criteria.andNameEqualTo(vaccinumBooking.getName());
            vaccinumBookingExample.or().andNameEqualTo(vaccinumBooking.getName());
        }
        if (StringUtils.isNoneBlank(vaccinumBooking.getPhoneno())){
            vaccinumBookingExample.or().andPhonenoEqualTo(vaccinumBooking.getPhoneno());
        }
        if (StringUtils.isNotBlank(vaccinumBooking.getCredentialsno())){
            vaccinumBookingExample.or().andCredentialsnoLike(vaccinumBooking.getCredentialsno());

        }
        if (StringUtils.isNotBlank(vaccinumBooking.getHomeaddress())){
            vaccinumBookingExample.or().andHomeaddressLike(vaccinumBooking.getHomeaddress());
        }
        System.out.println("vaccinumBooking 的值："+vaccinumBooking.toString());
        List<?>list = vaccinumBookingMapper.selectByExample(vaccinumBookingExample);


       return (List<VaccinumBookingExample>) list;
    }

    //@CrossOrigin(origins = "http://localhost:8082")

    //@CrossOrigin(origins = "http://localhost:8082")
    @RequestMapping("/vb/insertRecord")
    public void insertRecord(VaccinumBooking vaccinumBooking){
        //格式化日期时间类型为字符串
        LocalDateTime localDateTime=LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String ss = dateTimeFormatter.format(localDateTime).toString();
        System.out.println(ss);
        vaccinumBooking.setId(ss + new Random().nextInt(100));
        //vaccinumBooking.setName("name"+ new Random().nextInt(100));

        vaccinumBooking.setSex(1);
       int successnum =  vaccinumBookingMapper.insert(vaccinumBooking);
       if (successnum ==1){
           System.out.println("插入成功");
       }else {
           System.out.println("插入失败");
       }
    }

}
