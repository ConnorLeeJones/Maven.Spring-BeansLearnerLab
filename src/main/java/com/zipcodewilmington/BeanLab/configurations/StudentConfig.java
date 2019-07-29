package com.zipcodewilmington.BeanLab.configurations;

import com.zipcodewilmington.BeanLab.models.Student;
import com.zipcodewilmington.BeanLab.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){
        Student[] studentArr = { new Student(1, "Connor"),
                                new Student(2, "Henry"),
                                new Student(3, "Robert"),
                                new Student(4, "Anish")};

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(studentArr));
        return new Students(studentList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        Student[] studentArr = { new Student(1, "Sunhyun"),
                new Student(2, "Eleanor"),
                new Student(3, "Jim") };
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(studentArr));
        return new Students(studentList);
    }

}
