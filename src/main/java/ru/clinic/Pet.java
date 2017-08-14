package ru.clinic;

import java.util.Scanner;

/**
 * Parent class for others
 */
public class Pet {
    private String type;
    private String name;
    private int age;
    private int weight;
    private boolean healthy;
    private String illnesType;


    public Pet(String type, String name, int age, int weight, boolean healthy, String illnesType) {
        setType(type);
        setName(name);
        setAge(age);
        setWeight(weight);
        setHealthy(healthy);
        setIllnesType(illnesType);
    }

    /**
     * Test if name is empty
     *
     * @param name value
     */
    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Please, enter name");
            name = scanner.nextLine();
            setName(name);
        }

    }

    public String getType() {return type; }

    private void setType(String type) {this.type = type;}

    public String getName() {
        return name;
    }

    private void setWeight(int weight) {
        this.weight = Test(weight, "weight");
    }

    public int getWeight() {
        return weight;
    }

    private void setAge(int age) {
        this.age = Test(age, "age");
    }

    public int getAge() {
        return age;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getIllnesType() {
        return illnesType;
    }

    private void setIllnesType(String illnesType) {
        this.illnesType = illnesType;
    }

    /**
     * Method tested value of variables
     *
     * @param n    value
     * @param type name
     * @return new value
     */
    public static int Test(int n, String type) {
        Scanner scanner = new Scanner(System.in);
        int new_n = 0;
        if (n > 0 && n < 50) {
            new_n = n;
        } else {
            System.out.println("Please, enter " + type);
            new_n = Integer.parseInt(scanner.next());
            Test(new_n, type);
        }
        return new_n;
    }


}
