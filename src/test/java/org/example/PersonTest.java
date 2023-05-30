package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testGetFirstName() {
        Person person = new Person("John", "Doe", 30);
        String firstName = person.getFirstName();
        Assert.assertEquals(firstName, "John");
    }

    @Test
    public void testGetLastName() {
        Person person = new Person("John", "Doe", 30);
        String lastName = person.getLastName();
        Assert.assertEquals(lastName, "Doe");
    }

    @Test
    public void testGetAge() {
        Person person = new Person("John", "Doe", 30);
        int age = person.getAge();
        Assert.assertEquals(age, 30);
    }

    @Test
    public void testGetMaidenName() {
        Person person = new Person("Jane", "Smith", 35);
        String maidenName = person.getMaidenName();
        Assert.assertEquals(maidenName, null);
    }
}