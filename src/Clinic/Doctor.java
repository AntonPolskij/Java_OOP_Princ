package Clinic;

import Animals.Animal;
import Clinic.interfaces.Healable;
import Clinic.interfaces.Managable;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human implements Managable, Healable {
    private String specialization;
    private Nurse nurse;
    private ArrayList<Animal> patients;


    public Doctor(String name, String specialization, Nurse nurse, ArrayList patients) {
        super(name);
        this.specialization = specialization;
        this.nurse = nurse;
        this.patients = patients;
    }

    public Doctor addPatient(Animal animal) {
        patients.add(animal);
        return this;
    }

    @Override
    public void giveAssignment(String assignment) {
        System.out.println(this.nurse.getName() + " выполняет поручение " + this.nurse.doAssignment(assignment));
    }

    @Override
    public void heal() {
        System.out.println(this.getName() + " лечит " + this.patients.get(0).getTYPE() + " - " + this.patients.get(0).getName());
        this.patients.remove(0);
    }

}
