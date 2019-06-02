package com.company.lab2.AnimalRescue;

public class Main {

    public static void main(String[] arghs) {
        Dog rocky = new Dog();
        Adopter john = new Adopter();
        AnimalFood pedigree= new AnimalFood();
        RecreationType play= new RecreationType();
        VeterinaryPhysician doctorJoy= new VeterinaryPhysician();

        System.out.println(rocky.breed);
        rocky.drink();

        System.out.println(rocky.age);
        rocky.eat();

        System.out.println(rocky.height);
        rocky.sleep();

        System.out.println(rocky.name);
        rocky.sleep();

        System.out.println(rocky.name);
        rocky.play();

        System.out.println(rocky.breed);
        rocky.drink();

        System.out.println(john.name);
        john.money();

        System.out.println(pedigree.name);
        pedigree.price();

        System.out.println(play.recreation);
        play.recreation();

        System.out.println(doctorJoy.name);
        doctorJoy.specialization();


    }
}
