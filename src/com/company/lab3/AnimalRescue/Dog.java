package com.company.lab3.AnimalRescue;

public class Dog{
    private String breed;
    private int age;
    private int health;
    private float height;
    private float weight;
    private String name;
    private int mood;
    private String favFood;
    private String favPlay;


    public void setBreed (String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName (){
        return name;
    }


     public void eat(){ System.out.println( " He's eating dog food"); }
     public void drink(){
         System.out.println("He's drinking water");
     }
     public void play(){
         System.out.println("Play outdoor");
     }
     public void sleep(){
         System.out.println("zzzz");
     }
     public void mood() { System.out.println("He's current mood is 8");
     }
}
