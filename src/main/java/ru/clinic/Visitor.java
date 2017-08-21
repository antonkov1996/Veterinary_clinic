package ru.clinic;

import java.util.Random;

public class Visitor extends People implements Runnable {
    private Pet pet;

    public Visitor(String name, String surname, Pet pet) {
        super(name, surname);
        setPet(pet);
    }

    public Pet getPet() {
        return pet;
    }

    private void setPet(Pet pet) {
        this.pet = pet;
    }

    /**
     * Method add pets to order vector
     */
    public synchronized void addPetToClinic(Visitor visitor) {
        Main.orderVector.add(new Order(visitor));
    }

    /**
     * run method for Visitor
     */
    public void run() {

        addOrder();


    }

    /**
     * The method checks and adds animals to the situation
     */
    private synchronized void addOrder(){

        Random rnd = new Random(0);
        if (!this.getPet().isHealthy()&&Main.orderVector.size()<9)
        {
            addPetToClinic(this);
            addString();
            addOrder();
        }
        else {

            try {
                java.lang.Thread.sleep(rnd.nextInt(30000));
            } catch (InterruptedException e) {
            }
            if (this.getPet().isHealthy()) {
                this.getPet().setHealthy(false);
                addOrder();
            }else addOrder();
        }


    }

    /**
     *Print text
     */
    private synchronized void addString()
    {
        String s=""+this.getName()+" add his pet: "+this.getPet().getName()+" to order list";
        System.out.println("| "+s+" |");
        System.out.println();
    }

}

