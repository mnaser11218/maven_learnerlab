package com.github.curriculeon;

import java.util.*;

public class People implements  Iterable<Person>{
    private List<Person> personList = new ArrayList<>();
    public People() {
    }
    public void add(Person person){
        personList.add(person);
    }
    public Person findById(Long id){
        for(Person person : personList){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        boolean results = false;
        for(Person ele: personList){
            if(ele.equals(person)){
                results = true;
                break;
            }
        }

        return results;
    }
    public void remove(Person person){
  personList.remove(person);
    }

    public void remove(Long id){
     personList.remove(findById(id));
    }

    public void removeAll(){
        this.personList.clear();
    }
    public Integer count(){
       return this.personList.size();
    }
    public Person[] toArray(){
        return this.personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
