package ru.clinic;

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
        } else this.name = "Piter";
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (!surname.equals("")) {
            this.surname = name;
        } else this.surname = "Piter";
    }

    public String getSurname() {
        return surname;
    }
}
