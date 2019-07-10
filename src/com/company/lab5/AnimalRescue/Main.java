package com.company.lab5.AnimalRescue;

import com.company.lab2.AnimalRescue.Adopter;
import com.company.lab3.AnimalRescue.AnimalFood;
import com.company.lab3.AnimalRescue.Dog;
import com.company.lab3.AnimalRescue.VeterinaryPhysician;

public class Main {

    public static void main(String[] arghs) {
        Dog rocky = new Dog();
        Dog rex= new Dog();
        Dog larry= new Dog();
        //pot sa am cate obiecte vreau din aceeasi clasa Dog
        // prin encapsulare, clasa devine un concept, nu mai detine valori, vlorile i le dam in main
        Adopter john = new Adopter();
        AnimalFood pedigree= new AnimalFood();
        VeterinaryPhysician doctorJoy= new VeterinaryPhysician();

        rocky.setBreed("akita");
        System.out.println(rocky.getBreed());
        rex.setBreed("Ciobanesc");
        larry.setBreed("puddle");

        rocky.setAge(4);
        System.out.println(rocky.getAge());
         rocky.setName("Rocky");
        System.out.println(rocky.getName());





    }
}
