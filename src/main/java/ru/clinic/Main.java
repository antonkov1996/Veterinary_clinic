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
     * Vector with orders
     */
    public static Vector<Order> orderVector = new Vector<>();

    public static void main(String[] args) {
        Vector<Visitor> visitorVector = new Vector<>();
        Veterinary vet = new Veterinary("Nick", "Daniels", Veterinary.Skill.intern);
        /**
         * This cycle generates in random order all visitors
         */
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            Pet pet = new Pet(illness.PetType[rnd.nextInt(3)], illness.names[rnd.nextInt(9)], rnd.nextInt(5), rnd.nextInt(10), false, illness.IllnesType[rnd.nextInt(3)]);
            Visitor visitor = new Visitor(illness.names[rnd.nextInt(9)], illness.surnames[rnd.nextInt(9)], pet);
            visitorVector.add(visitor);
        }
        for (int i = 0; i < 10; i++) {
            new Thread(visitorVector.get(i)).start();
        }
        new Thread(vet).start();
        visitorMonitor(visitorVector);
    }

    /**
     * The method is synchronized and serves to delete the first order
     */
    public synchronized static void removeOrder() {
        orderVector.remove(0);
    }

    /**
     * Method print all orders in vector
     *
     * @param orderVector
     */
    public static void orderMonitor(Vector<Order> orderVector) {
        System.out.println();
        for (Order orders : orderVector
                ) {
            System.out.println("Name: " + orders.getVisitor().getName() + " Surname: " + orders.getVisitor().getSurname() + " with pet: " + orders.getVisitor().getPet().getType() + " with " + orders.getVisitor().getPet().getIllnesType());
        }
    }

    /**
     * Method print all persons in vector
     *
     * @param visitor
     */
    public static void visitorMonitor(Vector<Visitor> visitor) {

        System.out.println("\nVisitor vector");

        for (Visitor visitors : visitor
                ) {

            System.out.println("Name: " + visitors.getName() + " Surname: " + visitors.getSurname() + " with pet: " + visitors.getPet().getName() + " age: " + visitors.getPet().getAge() + " illness: " + visitors.getPet().getIllnesType() + " isHealtly: " + visitors.getPet().isHealthy());

        }


    }

}
