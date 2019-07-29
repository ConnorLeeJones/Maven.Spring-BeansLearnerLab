package com.zipcodewilmington.BeanLab.models;

public interface Teacher {

    void Teach(Learner learner, double numberOfHours);

    void Lecture(Iterable<? extends Learner> learners, double numberOfHours);


}
