package com.zipcodewilmington.BeanLab;

import com.zipcodewilmington.BeanLab.models.Classroom;
import com.zipcodewilmington.BeanLab.models.Instructors;
import com.zipcodewilmington.BeanLab.models.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;


    @Test
    public void testCurrentCohortStudentSize(){
        Assert.assertEquals((Integer) 4, currentCohort.getStudents().size());
    }

    @Test
    public void testCurrentCohortInstructorSize(){
        Assert.assertEquals((Integer) 4, currentCohort.getInstructors().size());
    }

    @Test
    public void testCurrentCohortStudyTimeBeforeLecture(){
        for (Student student : currentCohort.getStudents()){
            Assert.assertEquals(0, student.getTotalStudyTime(), 0.0);
        }

//        Assert.assertEquals((Integer) 3, previousCohort.getStudents().size());
//        Assert.assertEquals((Integer) 3, previousCohort.getInstructors().size());
    }




    @Test
    public void testPreviousCohortStudentSize(){
        for (Student student : previousCohort.getStudents()){
            System.out.println(student.toString());
        }

        Assert.assertEquals((Integer) 3, previousCohort.getStudents().size());
    }

    @Test
    public void testPreviousCohortInstructorSize(){
        Assert.assertEquals((Integer) 4, previousCohort.getInstructors().size());
    }





}
