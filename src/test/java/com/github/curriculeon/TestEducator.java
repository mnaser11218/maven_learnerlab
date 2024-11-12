package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        //given
        Educator instructor = Educator.AYAD;

        //when
        boolean isInstance = instructor instanceof Teacher;


        //then
        Assert.assertTrue(isInstance);

    }


    @Test
    public void testTeach(){
        //given
        Educator instructor = Educator.AYAD;
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
        Educator instructor = Educator.AYAD;
        Student[] students = new Student[]{new Student(), new Student()};
        Student firstStudent = students[0];
        //when
        Double lectureTime = 50.0;
        Double lectureTimeForStudent = lectureTime / students.length;
        Assert.assertNotEquals(firstStudent.getTotalStudyTime(), lectureTimeForStudent);
        instructor.lecture(students, lectureTime);


        //then
        Assert.assertEquals(firstStudent.getTotalStudyTime(), lectureTimeForStudent);

    }
}
