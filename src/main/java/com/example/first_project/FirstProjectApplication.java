package com.example.first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {

        BinarySearchImpl binarySearch = new BinarySearchImpl();

        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);




        SpringApplication.run(FirstProjectApplication.class, args);
    }





}
