package com.newstarlab.vaccinebooking.controller;

import com.newstarlab.vaccinebooking.mapper.VaccinumBookingMapper;
import com.newstarlab.vaccinebooking.pojo.VaccinumBooking;
import com.newstarlab.vaccinebooking.pojo.VaccinumBookingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

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
    //@CrossOrigin(origins = "http://localhost:8081")
    @CrossOrigin(origins = "http://localhost:8081")
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
    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/insertRecord")
    public void insertRecord(VaccinumBooking vaccinumBooking){
        //格式化日期时间类型为字符串
        LocalDateTime localDateTime=LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String ss = dateTimeFormatter.format(localDateTime).toString();
        System.out.println(ss);
        vaccinumBooking.setId(ss + new Random().nextInt(100));
        vaccinumBooking.setName("name"+ new Random().nextInt(100));
        vaccinumBooking.setSex(1);
       int successnum =  vaccinumBookingMapper.insert(vaccinumBooking);
       if (successnum ==1){
           System.out.println("插入成功");
       }else {
           System.out.println("插入失败");
       }
    }
}
