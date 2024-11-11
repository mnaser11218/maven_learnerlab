package com.github.curriculeon;

public final class Students extends People{
    private static Students INSTANCE = new Students();
    private Students() {
        this.add(new Student(5l, "mohammed"));
        this.add(new Student(9l, "naser"));
        this.add(new Student(4l, "ayad"));

    }

  public static Students getInstance(){
        return INSTANCE;
  }
}
