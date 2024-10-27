package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public enum Classroom {
   CLASSROOM, INSTRUCTORS;

    Classroom() {
    }
    public void hostLecture(Teacher teacher, Double time){

    }
    public void hostLecture(Long l, Double time){

    }
    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        return studyMap;
    }

}
