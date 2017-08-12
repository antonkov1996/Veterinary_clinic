package ru.clinic;

public class Visitor extends People{
    private illness.PetType petType;
    public Visitor(String name, String surname, illness.PetType petType) {
        super(name, surname);
        setPetType(petType);
    }

    public illness.PetType getPetType() {
        return petType;
    }

    public void setPetType(illness.PetType petType) {
        this.petType = petType;
    }
    /**
     * add new method
     */
}
