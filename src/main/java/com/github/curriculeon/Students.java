package com.github.curriculeon;

public final class Students extends People<Student>{
    private static Students INSTANCE = new Students();
    private Students() {
        this.add(new Student(5l, "mohammed"));
        this.add(new Student(9l, "naser"));
        this.add(new Student(4l, "ayad"));

    }

    @Override
    public Student[] toArray() {
        return this.personList.toArray(new Student[0]);
    }

    public static Students getInstance(){
        return INSTANCE;
  }
}
