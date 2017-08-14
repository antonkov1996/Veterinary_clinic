package ru.clinic;

import java.util.Random;
import java.util.Vector;

/**
 * This program Is an example of using multithreading.
 * In the veterinary clinic there are several doctors,
 * visitors with pets and a list of orders.
 */
public class Main {


    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Vector<Visitor> visitorVector = new Vector<Visitor>();
        Vector<Veterinary> veterinaryVector;
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            Visitor visitor = new Visitor(illness.names[rnd.nextInt(9)], illness.surnames[rnd.nextInt(9)], illness.PetType[rnd.nextInt(3)]);
            visitorVector.add(visitor);
        }
        System.out.println("Visitor vector");
        for (Visitor visitors:visitorVector
             ) {
            System.out.println("Name: "+visitors.getName()+" Surname: "+visitors.getSurname()+" with pet: "+visitors.getPetType());

        }

    }


}
