package com.msj.jdbcTemplateDemo;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

//jdbcTemplate 进行增删改查
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-bean03.xml")


public class TestJdbcTemplate {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void selectAll(){
        String sql = "select * from user where id=?";
        BeanPropertyRowMapper<User> mapper = new BeanPropertyRowMapper<User>(User.class);
        User user = jdbcTemplate.queryForObject(sql, mapper, 1);
        System.out.println(user);
    }

}
