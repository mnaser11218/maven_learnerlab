package com.github.curriculeon;

import java.util.*;

abstract class People <PersonType extends Person> implements  Iterable<PersonType>{
    //protected indicates that only subclasses have access to this field
    protected List<PersonType> personList = new ArrayList<>();
    public People() {
    }
    public void add(PersonType person){
        personList.add(person);
    }
    public PersonType findById(Long id){
        for(PersonType person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(PersonType person){
        boolean results = false;
        for(PersonType ele: personList){
            if(ele.equals(person)){
                results = true;
                break;
            }
        }

        return results;
    }
    public void remove(PersonType person){
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
    abstract public PersonType[] toArray();


    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
