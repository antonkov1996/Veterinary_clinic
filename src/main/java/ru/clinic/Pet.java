package ru.clinic;

import java.util.Scanner;

/**
 * Parent class for others
 */
public class Pet {
    private String name;
    private int age;
    private int weight;
    private boolean healthy;
    private illness.IllnesType illnesType;

    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        if (!name.equals("")) {
            this.name = name;
        } else
        {
            System.out.println("Please, enter name");
            name=scanner.nextLine();
            setName(name);
        }

    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = Test(weight,"weight");
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = Test(age,"age");
    }

    public int getAge() {
        return age;
    }

    public static int Test(int n,String type)
    {
        Scanner scanner= new Scanner(System.in);
        int new_n=0;
        if (n>0&&n<50) {
            new_n=n;
        } else
        {
            System.out.println("Please, enter "+type);
            new_n=Integer.parseInt(scanner.next());
            Test(new_n,type);
        }
        return new_n;
    }



}
