package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
   public void testImplementation(){
        //given
        Instructor instructor = new Instructor();

        //when
        boolean isInstance = instructor instanceof Teacher;


        //then
        Assert.assertTrue(isInstance);

    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor();

        //when
        boolean isInstance = instructor instanceof Person;


        //then
        Assert.assertTrue(isInstance);

    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor();
        Learner student = new Student();
        //when
        Double initialTime = student.getTotalStudyTime();
        Double studyTime = 5.0;
        instructor.teach(student, studyTime);
        Double addedTime = initialTime + studyTime;


        //then
        Assert.assertEquals(student.getTotalStudyTime(), addedTime);

    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor();
        Student[] students = new Student[]{new Student(), new Student()};
        //when
        Double lectureTime = 50.0;
        Double lectureTimeForStudent = lectureTime / students.length;
        instructor.lecture(students, lectureTime);
        Student firstStudent = students[0];


        //then
        Assert.assertEquals(firstStudent.getTotalStudyTime(), lectureTimeForStudent);

    }


}
