package com.skyAdmin;

import lombok.extern.slf4j.Slf4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@Slf4j
@SpringBootApplication
@EnableScheduling
@MapperScan("com.skyAdmin.mapper")
public class StuApplication {
    public static void main(String[] args) {SpringApplication.run(StuApplication.class, args);}
}
