package ru.clinic;

import org.junit.Assert;

import static org.junit.Assert.*;

public class PetTest {
    @org.junit.Test
    public void test() throws Exception {
        Pet pet =new Pet("1",1,1,true, "1");
        pet.setAge(0);
        assertEquals(10,pet.getAge());
    }

}