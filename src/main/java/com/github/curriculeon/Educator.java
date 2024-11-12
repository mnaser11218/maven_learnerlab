package com.github.curriculeon;

public enum Educator implements Teacher{
    MOHAMMED, AYAD, NASER;
     private final Instructor instructor;
    private Double hoursWorked = 0.0;


    Educator() {
        this.instructor = new Instructor();
        Instructors.getInstance().add(this.instructor);

    }

    @Override
    public void lecture(Learner[] learners, Double time) {
        this.instructor.lecture(learners, time);
        this.hoursWorked += time;
    }

    @Override
    public void teach(Learner learner, Double time) {
this.instructor.teach(learner, time);
this.hoursWorked+= time;
    }
}
