package ru.clinic;

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
     * add new method
     */
    public void addPetToClinic(Visitor visitor) {
        Main.orderVector.add(new Order(visitor));
    }

    /**
     * run method for Visitor
     */
    public void run() {
        System.out.println("Start thread");
        addPetToClinic(this);
        System.out.println(""+this.getName()+"add his pet: "+this.getPet().getName()+"to order" );

    }
}

