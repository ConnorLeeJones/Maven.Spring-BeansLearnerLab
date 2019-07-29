package com.zipcodewilmington.BeanLab.models;

import java.util.Collection;
import java.util.Collections;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }


    public void Teach(Learner learner, double numberOfHours) {
        learner.Learn(numberOfHours);
    }

    public void Lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int learnersSize = 0;
        if (learners instanceof Collection<?>){
            learnersSize = (((Collection<? extends Learner>) learners).size());
        }

        double numberOfHoursPerLearner = numberOfHours / learnersSize;

        for (Learner learner : learners){
            learner.Learn(numberOfHoursPerLearner);
        }

    }
}
