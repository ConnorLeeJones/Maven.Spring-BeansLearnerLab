package com.zipcodewilmington.BeanLab.configurations;

import com.zipcodewilmington.BeanLab.models.Instructor;
import com.zipcodewilmington.BeanLab.models.Instructors;
import com.zipcodewilmington.BeanLab.models.Student;
import com.zipcodewilmington.BeanLab.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class InstructorsConfig {


    @Bean
    public Instructors tcUsInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Sarah"),
                new Instructor(2, "Bart"),
                new Instructor(3, "Matthew") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }

    @Bean
    public Instructors tcUkInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Olivia"),
                new Instructor(2, "John"),
                new Instructor(3, "Oliver") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        Instructor[] instructorArr = { new Instructor(1, "Kris"),
                new Instructor(2, "Dolio"),
                new Instructor(3, "Roberto"),
                new Instructor(4, "Wilhem")};

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));
        return new Instructors(instructorList);
    }


}
