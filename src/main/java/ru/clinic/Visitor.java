package ru.clinic;

public class Visitor extends People {
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
}
