package com.company.lab5.AnimalRescue;

public class Animal {
    private String breed;
    private int age;
    private float weight;
    private float height;
    private String name;
    private String color;

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("He's eating food");
    }

    public void sleep() {
        System.out.println("He's sleeping 4 hrs per day");
    }

    public void drink() {
        System.out.println("He's drinking mountain water");
    }

    public void speak() {
        System.out.println("Hey");
    }

        public void play() {
            System.out.println("He jumps");
        }

        }





