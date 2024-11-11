package com.github.curriculeon;

public final class Students extends People{
    public static Students INSTANCE = new Students();
    private Students() {
        INSTANCE.add(new Student(5l, "mohammed"));
        INSTANCE.add(new Student(9l, "naser"));
        INSTANCE.add(new Student(4l, "ayad"));

    }

  public static Students getInstance(){
        return INSTANCE;
  }
}
