package com.zipcodewilmington.BeanLab.models;

public class Classroom {


    private Instructors instructors;
    private Students students;


    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }



    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.Lecture(this.students, numberOfHours);
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
