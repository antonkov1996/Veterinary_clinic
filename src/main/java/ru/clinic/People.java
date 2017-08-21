package ru.clinic;

import java.util.Scanner;

/**
 * Parent class for others
 */
public class People {
    /**
     * Name of people
     */
    private String name;
    /**
     * Surname of people
     */
    private String surname;


    public People(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Please, enter name");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
            setName(name);
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (!surname.equals("")) {
            this.surname = surname;
        } else {
            System.out.println("Please, enter surname");
            Scanner scanner1 = new Scanner(System.in);
            surname = scanner1.nextLine();
            setName(name);
        }
    }

    public String getSurname() {
        return surname;
    }
}
