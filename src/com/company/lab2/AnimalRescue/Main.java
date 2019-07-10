package com.company.lab2.AnimalRescue;

public class Main {

    public static void main(String[] arghs) {
        Dog rocky = new Dog();
        Adopter john = new Adopter();
        AnimalFood pedigree= new AnimalFood();
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
        john.behaviour();
        System.out.println(john.age);
        john.language();

        System.out.println(john.name);
        john.work();

        System.out.println(pedigree.name);
        pedigree.smell();

        System.out.println(doctorJoy.name);
        doctorJoy.treatment();
        System.out.println(doctorJoy.age);
        doctorJoy.consultation();
        System.out.println(pedigree.quantity);
        pedigree.smell();
    }
}
