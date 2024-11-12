package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
   INSTANCE;
   private Students students = Students.getInstance();
   private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, Double numberOfHours){
        Student[] personArray = students.toArray();
        teacher.lecture(personArray, numberOfHours);
    }
    public void hostLecture(Long id, Double numberOfHours){
    Person person = Instructors.getInstance().findById(id);
    Teacher teacher = (Teacher) person;
    hostLecture(teacher, numberOfHours);
    }
    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for(Person person : Students.getInstance().toArray()){
            Student student = (Student) person;
            double numberOfHours = student.getTotalStudyTime();
            map.put(student, numberOfHours);
        }
        return map;
    }

}
