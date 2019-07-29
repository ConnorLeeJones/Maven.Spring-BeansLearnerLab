package com.zipcodewilmington.BeanLab.models;

import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType personType){
        this.personList.add(personType);

    }

    public void remove(PersonType personType){
        this.personList.remove(personType);
    }

    public Integer size(){
        return this.personList.size();
    }

    public void clear(){
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes){
        for (PersonType personType : personTypes){
            this.personList.add(personType);
        }
    }

    public PersonType findById(long id){
        for (PersonType personType : this.personList){
            if (personType.getId() == id){
                return personType;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }



}
