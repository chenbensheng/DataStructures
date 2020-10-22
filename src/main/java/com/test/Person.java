package com.test;

import java.util.Objects;

/**
 * @Author: chenbensheng
 * @CreateDate: 2020/10/16 10:06
 */
public class Person {

    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @desc重写hashCode
     */
    @Override
    public int hashCode(){
        return Objects.hash(name, age);

    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(obj instanceof Person){
            Person person=(Person) obj;
            if(person.name.equals(name)&&person.age==age){
              return true;
            }
        }
        return false;
    }
}
