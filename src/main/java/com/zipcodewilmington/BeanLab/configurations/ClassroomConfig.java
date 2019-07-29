package com.zipcodewilmington.BeanLab.configurations;

import com.zipcodewilmington.BeanLab.models.Classroom;
import com.zipcodewilmington.BeanLab.models.Instructors;
import com.zipcodewilmington.BeanLab.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {


    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

}
