package ru.clinic;

/**
 * Class with description of visitor and his pet
 */
public class Order {
    private Visitor visitor;

    public Order(Visitor visitor) {
        setVisitor(visitor);

    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }

}
