import Animals.*;
import Clinic.Doctor;
import Clinic.Nurse;
import Clinic.VetClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
//        Animals.Animal barsik = new Animals.Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Animals.Color.BLACK, "siamskiy");
//        System.out.println(barsik.getName());
//        System.out.println(barsik.getVaccinations());
//        barsik.setVaccinations(List.of(chumka, new Animals.Vaccination("столбняк", LocalDate.now())));
//        System.out.println(barsik.getVaccinations());
//        Animals.Dog barbos = new Animals.Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Animals.Color.WHITE);
////        List<Animals.Animal> animals = new ArrayList<>();
////        animals.add(barsik);
////        animals.add(barbos);
////        for (Animals.Animal animal : animals) {
////            if (animal instanceof Animals.Cat) {
////                System.out.println(((Animals.Cat) animal).getBreed());
////            }
////            System.out.println(animal.getName());
////        }
//        ((Animals.Cat) barsik).getBreed();
//        barsik.lifeCycle();

        Fish carp = new Fish("Карась");
        Shark jaws = new Shark("Челюсть");
        Duck donald = new Duck("Дональд");
        Crow karkarych = new Crow("Каркарыч");
        Cheetah speedy = new Cheetah("Шурик");
        Rhino rocksteady = new Rhino("Рокстеди");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(carp);
        animals.add(jaws);
        animals.add(donald);
        animals.add(karkarych);
        animals.add(speedy);
        animals.add(rocksteady);

       /* for (Animal animal : animals )
        {
            animal.fly();
        }


        System.out.println("-----------------------------------------");

        for (Animal animal :
                animals
        ) {
            if (animal instanceof Fish || animal instanceof Shark) {
                animal.swim();
            } else if (animal instanceof Crow || animal instanceof Duck) {
                animal.fly();
            } else if (animal instanceof Rhino || animal instanceof Cheetah) {
                animal.toGo();
            }
        }*/
        VetClinic clinic = new VetClinic("Лечим!");
        Doctor doctor = new Doctor("Айболит", "Терапевт", new Nurse("Анна"), animals);
        doctor.heal();
        doctor.giveAssignment("Подать шпринц");
        doctor.giveAssignment("Подать обезболивающее");
        doctor.heal();
        doctor.addPatient(new Crow("Привет"));
        System.out.println("-----------------------------------------");
        animals.add(jaws);
        clinic.addFlyablePatients(animals);
        clinic.addSwimmablePatients(animals);
        clinic.addRunnablePatients(animals);
    }



}