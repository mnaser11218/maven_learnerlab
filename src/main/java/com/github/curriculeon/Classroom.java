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
    Teacher teacher = Instructors.getInstance().findById(id);
    hostLecture(teacher, numberOfHours);
    }
    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for(Student student : Students.getInstance().toArray()){
            double numberOfHours = student.getTotalStudyTime();
            map.put(student, numberOfHours);
        }
        return map;
    }

}
