package com.works;

import com.works.customnotataion.Custom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Custom
// @ComponentScan(basePackages = {"customers"})
public class Days1Application {

    public static void main(String[] args) {
        SpringApplication.run(Days1Application.class, args);
    }

}
