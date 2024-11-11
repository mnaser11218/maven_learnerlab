package com.github.curriculeon;

public final class Instructors extends People{
    private static Instructors INSTANCE  = new Instructors();
    private Instructors() {
        this.add(new Instructor(1l, "mohammed"));
        this.add(new Instructor(2l, "ayad"));
        this.add(new Instructor(3l, "naser"));

    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}
