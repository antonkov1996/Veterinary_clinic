package ru.clinic;

public class Visitor extends People {
    private String petType;

    public Visitor(String name, String surname, String petType) {
        super(name, surname);
        setPetType(petType);
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    /**
     * add new method
     */
}
