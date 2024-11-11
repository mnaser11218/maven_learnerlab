package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudents {
@Test
    public void test(){
    // given
    Students students = Students.getInstance();
    String[] names = "mohammed ayad naser".split(" ");

    //when
    List<String> nameList = Arrays
            .stream(Students.getInstance().toArray())
            .map(Person::getName)
            .collect(Collectors.toList());

    //then
    for(String expectedName : names){
        Assert.assertTrue(nameList.contains(expectedName));
    }


}
}
