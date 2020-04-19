package com.cdmu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sbn
 */
@MapperScan(basePackages = {"com.cdmu.mapper"})
@SpringBootApplication
public class BiomedicalEngineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiomedicalEngineeringApplication.class, args);
    }
}
