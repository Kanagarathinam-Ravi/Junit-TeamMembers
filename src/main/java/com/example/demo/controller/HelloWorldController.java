package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

        @GetMapping("hello")
        public String showHello() {
            return "Hello World";
        }
        @GetMapping("TeamMembers")
        public List<String> getTeamMembersName() {
            List<String> members = new ArrayList<>();
            members.add("Vijay Ramanujam");
            members.add("Kalai Selvan");
            members.add("B Jebin Sam");
            members.add("Kowshikbharathi Mani");            
            members.add("Manisha Arunraj");
            members.add("Gokulaprakaash Arumugham");
            members.add("Parameswaran L");
            members.add("Nataraj Manivannan");
            members.add("Kanagarathinam Ravi");
            members.add("Raji Rajakumar");
            return members;
        }   
    }
