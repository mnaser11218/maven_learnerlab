package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON, HASEEB;
    private Double hoursWorked = 0.0;

    Educator(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    Educator() {
    }

    @Override
    public void lecture(Learner[] learners, Double time) {

    }

    @Override
    public void teach(Learner learner, Double time) {

    }
}
