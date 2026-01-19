package com.example.day2part2.controller;

import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        StudentModel student1 = new StudentModel(1,"Harsh","harsh@gmail.com");
        StudentModel student2 = new StudentModel(2,"Harshit","harsh@gmail.com");
        StudentModel student3 = new StudentModel(3,"Harshita","harsh@gmail.com");
        StudentModel student4 = new StudentModel(4,"Harsha","harsh@gmail.com");
        StudentModel student5 = new StudentModel(5,"Haresh","harsh@gmail.com");

        ArrayList<StudentModel> list = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;

    }
}
