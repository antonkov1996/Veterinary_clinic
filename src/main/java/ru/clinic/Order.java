package ru.clinic;

/**
 * Class with description of visitor and his pet
 */
public class Order {
    private Visitor visitor;
    private Pet pet;

    public Order(Visitor visitor, Pet pet) {
        setVisitor(visitor);
        setPet(pet);
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
