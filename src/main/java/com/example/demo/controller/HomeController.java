package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author web1992
 * @date 2020/3/15  11:58
 */
@RestController
public class HomeController {


    @GetMapping("/")
    public User hello() {

        System.out.println("Time is " + new Date());
        return new User("web1992", "18");
    }


    static class User {

        private String name;
        private String age;

        public User(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

}
