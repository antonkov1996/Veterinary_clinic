package ru.clinic;

import java.util.Random;
import java.util.Vector;

/**
 * This program Is an example of using multithreading.
 * In the veterinary clinic there are several doctors,
 * visitors with pets and a list of orders.
 */
public class Main {
    public static void main(String[] args) {
        Vector<Visitor> visitorVector = new Vector<>();
        Vector<Veterinary> veterinaryVector = new Vector<>();
        Veterinary veterinary1 = new Veterinary("Nick", "Daniels", Veterinary.Skill.intern);
        Veterinary veterinary2 = new Veterinary("Thomas", "Brown", Veterinary.Skill.doctor);
        Veterinary veterinary3 = new Veterinary("James", "Evans", Veterinary.Skill.director);
        veterinaryVector.add(veterinary1);
        veterinaryVector.add(veterinary2);
        veterinaryVector.add(veterinary3);

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            Pet pet = new Pet(illness.PetType[rnd.nextInt(3)], illness.names[rnd.nextInt(9)], rnd.nextInt(5), rnd.nextInt(10), false, illness.IllnesType[rnd.nextInt(3)]);
            Visitor visitor = new Visitor(illness.names[rnd.nextInt(9)], illness.surnames[rnd.nextInt(9)], pet);
            visitorVector.add(visitor);
        }
        veterinaryMonitor(veterinaryVector);
        visitorMonitor(visitorVector);
    }
    public static Vector<Order> orderVector = new Vector<>();

    /**
     * Method print all persons in vector
     *
     * @param veterinaryVector vector with veterinary
     */
    private static void veterinaryMonitor(Vector<Veterinary> veterinaryVector) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Veterinary vector");
        for (Veterinary veterinaris : veterinaryVector
                ) {
            System.out.println("Name: " + veterinaris.getName() + " Surname: " + veterinaris.getSurname() + " with skill: " + veterinaris.getSkill());
        }
    }

    /**
     * Method print all persons in vector
     *
     * @param visitor
     */
    private static void visitorMonitor(Vector<Visitor> visitor) {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Visitor vector");

            for (Visitor visitors : visitor
                    ) {

                System.out.println("Name: " + visitors.getName() + " Surname: " + visitors.getSurname() + " with pet: " + visitors.getPet().getName() + " age: " + visitors.getPet().getAge() + " illness: " + visitors.getPet().getIllnesType());

            }



    }
}
