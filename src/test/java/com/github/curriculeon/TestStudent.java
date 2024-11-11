package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student b = new Student();
        boolean isInstance = (b instanceof Learner);
        Assert.assertTrue(isInstance);
    }
    @Test
    public void testLearn(){
        //given
        Student student = new Student();
        //when
        Double num = student.getTotalStudyTime();
        Double expected = 0.0;
        Assert.assertEquals(num, expected);
        Double hoursStudied = 1.0;
        student.learn(hoursStudied);
        //then
        Assert.assertEquals(student.getTotalStudyTime(), hoursStudied);



    }

}
