package com.zipcodewilmington.BeanLab;

import com.zipcodewilmington.BeanLab.models.Instructor;
import com.zipcodewilmington.BeanLab.models.Instructors;
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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("instructors")
    private Instructors zcwInstructors;

    @Autowired
    @Qualifier("tcUsInstructors")
    private Instructors tcUsInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;



    @Test
    public void testZcwInstructorsSize(){
        Assert.assertEquals((Integer) 4, zcwInstructors.size());
    }

    @Test
    public void testZcwInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Kris"),
                new Instructor(2, "Dolio"),
                new Instructor(3, "Roberto"),
                new Instructor(4, "Wilhem")};

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));

        for (int i = 0; i < instructorList.size(); i++){
            Assert.assertEquals(instructorList.get(i).toString(), zcwInstructors.findById(i+1).toString());
        }
    }

    @Test
    public void testTcUsInstructorsSize(){
        Assert.assertEquals((Integer) 3, tcUsInstructors.size());
    }

    @Test
    public void testTcUsInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Sarah"),
                new Instructor(2, "Bart"),
                new Instructor(3, "Matthew") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));

        for (int i = 0; i < instructorList.size(); i++){
            Assert.assertEquals(instructorList.get(i).toString(), tcUsInstructors.findById(i+1).toString());
        }
    }

    @Test
    public void testTcUkInstructorsSize(){
        Assert.assertEquals((Integer) 3, tcUkInstructors.size());
    }

    @Test
    public void testTcUkInstructors(){
        Instructor[] instructorArr = { new Instructor(1, "Olivia"),
                new Instructor(2, "John"),
                new Instructor(3, "Oliver") };

        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructorArr));

        for (int i = 0; i < instructorList.size(); i++){
            Assert.assertEquals(instructorList.get(i).toString(), tcUkInstructors.findById(i+1).toString());
        }
    }


}
