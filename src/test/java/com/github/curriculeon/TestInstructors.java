package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestInstructors {

    @Test
    public void test(){
        // given
        String []names = "mohammed ayad naser".split(" ");
        Instructors instructors = Instructors.getInstance();
        //when
        List<String> listNames = Arrays.stream(Instructors.getInstance().toArray())
                .map(Person::getName)
                .collect(Collectors.toList());


        //then
        for(String name: names){
           Assert.assertTrue(listNames.contains(name));
        }
    }
}
