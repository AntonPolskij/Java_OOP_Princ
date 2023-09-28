package Clinic;

import Animals.Animal;
import Animals.Flyable;
import Animals.Runnable;
import Animals.Swimmable;

import java.util.ArrayList;

public class VetClinic {
    private String name;
    public VetClinic(String name) {
        this.name = name;
    }

    public void addRunnablePatients(ArrayList<Animal> animals){
        for(Animal animal : animals) {
            if (animal instanceof Runnable) {
                System.out.println(animal.getTYPE() + " " + animal.getName() + " - " + "бегающий");
            }
        }
    }

    public void addFlyablePatients(ArrayList<Animal> animals){
        for(Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.getTYPE() + " " + animal.getName() + " - " + "летающий");
            }
        }
    }

    public void addSwimmablePatients(ArrayList<Animal> animals){
        for(Animal animal : animals) {
            if (animal instanceof Swimmable) {
                System.out.println(animal.getTYPE() + " " + animal.getName() + " - " + "плавающий");
            }
        }
    }
}
