package com.github.curriculeon;

public class Instructor extends Person implements Teacher{
    public Instructor() {
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double time){
        learner.learn(time);
    }
    public void lecture (Learner[] learners, Double time){
        double numberOfHoursPerLearner = time / learners.length;
        for(Learner learner : learners){
            teach(learner, numberOfHoursPerLearner);
        }
    }

}
