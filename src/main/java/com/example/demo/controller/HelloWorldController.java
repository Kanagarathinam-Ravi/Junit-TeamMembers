package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${spring.Team-Members.name}")
    String name;
    @Value("${spring.Team-Members.email}")
    String mail;

    /**
     * Grab a property and prints in console when we hit hello end point
     *
     * @return Hello World
     */
    @GetMapping("hello")
    public String showHello() {

        System.out.println(name);
        System.out.println(mail);
        return "Hello World";
    }

    /**
     * Returns Team members list when we hit the TeamMembers end point
     *
     * @return team members list
     */
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

    @GetMapping("name")
    public static String getName() {
        String name = "Kanagarathinam Ravi";
        return name;
    }
}
