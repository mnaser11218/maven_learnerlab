package com.github.curriculeon;

public class Student extends Person implements Learner{
    private Double totalStudyTime=0.0;

    public Student(Double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double hours) {
        totalStudyTime+=hours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
