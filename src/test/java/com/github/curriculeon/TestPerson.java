package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testPersonConstructor(){
        //given
        Long expectedId = 5L;
        String expectedName = "mohammed";
        //when
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void testSetName(){
        //given
        String expectedName = "mohammed";
        //when
        Person person = new Person();
        Assert.assertNotEquals(expectedName, person.getName());
        person.setName(expectedName);

        //then
        Assert.assertEquals(expectedName,person.getName());

    }

    @Test
    public void testSetId(){
        //given
        Long expectedId = 1L;
        //when
        Person person = new Person();
        Assert.assertNotEquals(person.getId(), expectedId);
        person.setId(expectedId);

        //then
        Assert.assertEquals(expectedId,person.getId());

    }


}
