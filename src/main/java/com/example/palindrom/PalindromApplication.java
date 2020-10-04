package com.example.palindrom;

import com.example.palindrom.Controller.PalindromeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = PalindromeController.class)
public class PalindromApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalindromApplication.class, args);
    }

}
