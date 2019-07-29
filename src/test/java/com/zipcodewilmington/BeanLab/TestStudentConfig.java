package com.zipcodewilmington.BeanLab;

import com.zipcodewilmington.BeanLab.models.Student;
import com.zipcodewilmington.BeanLab.models.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudentsSize(){
        Assert.assertEquals((Integer) 4, currentStudents.size());
    }

    @Test
    public void testCurrentStudents(){
        Student[] studentArr = { new Student(1, "Connor"),
                new Student(2, "Henry"),
                new Student(3, "Robert"),
                new Student(4, "Anish")};
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(studentArr));

        for (int i = 0; i < studentList.size(); i++){
            Assert.assertEquals(studentList.get(i).toString(), currentStudents.findById(i+1).toString());
        }
    }

    @Test
    public void testPreviousStudentsSize(){
        Assert.assertEquals((Integer) 3, previousStudents.size());
    }

    @Test
    public void testPreviousStudents(){
        Student[] studentArr = { new Student(1, "Sunhyun"),
                new Student(2, "Eleanor"),
                new Student(3, "Jim") };
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(studentArr));

        for (int i = 0; i < studentList.size(); i++){
            Assert.assertEquals(studentList.get(i).toString(), previousStudents.findById(i+1).toString());
        }
    }





}
