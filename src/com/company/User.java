package com.company;

public class User {
    private long id;
    private String name;
    private int age;
    private String gender;
    private UserDao userDao;
    private UserSirvice userSirvice;

    void setId(long id){
        this.id = id;
        }
    long getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setGender(String gender){
        this.gender = gender;
    }
    String getGender(){
        return gender;
    }

}
