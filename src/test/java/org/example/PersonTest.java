package org.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonTest {

    @Test(description = "validation of method testGetFirstName()")
    public void testGetFirstName() {
        Person person = new Person("John", "Doe", 30);
        String firstName = person.getFirstName();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(firstName, "John");
        softAssert.assertAll();
    }

    @Test(description = "validation of method testGetLastName()")
    public void testGetLastName() {
        Person person = new Person("John", "Doe", 30);
        String lastName = person.getLastName();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(lastName, "Doe");
        softAssert.assertAll();
    }

    @Test(description = "validation of method testGetAge()")
    public void testGetAge() {
        Person person = new Person("John", "Doe", 30);
        int age = person.getAge();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(age, 30);
        softAssert.assertAll();
    }

    @Test(description = "validation of method testGetMaidenName()")
    public void testGetMaidenName() {
        Person person = new Person("Jane", "Smith", 35);
        String maidenName = person.getMaidenName();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNull(maidenName);
        softAssert.assertAll();
    }
}
