package com.github.curriculeon;

public class Instructor extends Person{
    public Instructor() {
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double time){
        learner.learn(time);
    }
    public void lecture (Learner learners [], Double time){
        for(Learner learner : learners){
            learner.learn(time);
        }
    }

}
