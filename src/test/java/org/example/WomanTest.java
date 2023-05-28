package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testGetPartner() {
        Man man = new Man("John", "Doe", 35);
        Woman woman = new Woman("Anna", "Smith", 30);
        woman.setPartner(man);

        Man partner = woman.getPartner();

        Assert.assertEquals(partner, man);
    }

    @Test
    public void testSetPartner() {
        Man man = new Man("John", "Doe", 35);
        Woman woman = new Woman("Anna", "Smith", 30);

        woman.setPartner(man);
        Man partner = woman.getPartner();

        Assert.assertEquals(partner, man);
    }

    @Test
    public void testGetMaidenName() {
        String maidenName = "Johnson";
        Woman woman = new Woman("Anna", "Smith", 30);
        woman.setMaidenName(maidenName);

        String retrievedMaidenName = woman.getMaidenName();

        Assert.assertEquals(retrievedMaidenName, maidenName);
    }

    @Test
    public void testSetMaidenName() {
        String maidenName = "Johnson";
        Woman woman = new Woman("Anna", "Smith", 30);

        woman.setMaidenName(maidenName);
        String retrievedMaidenName = woman.getMaidenName();

        Assert.assertEquals(retrievedMaidenName, maidenName);
    }

    @Test
    public void testIsRetired() {
        Woman woman1 = new Woman("Anna", "Smith", 50); // Not retired
        Woman woman2 = new Woman("Jane", "Doe", 65); // Retired

        boolean isRetired1 = woman1.isRetired();
        boolean isRetired2 = woman2.isRetired();

        Assert.assertFalse(isRetired1);
        Assert.assertTrue(isRetired2);
    }

    @Test
    public void testRegisterPartnership() {
        Man man = new Man("John", "Doe", 35);
        Woman woman = new Woman("Anna", "Smith", 30);

        woman.registerPartnership(man);
        Man partner = woman.getPartner();

        Assert.assertEquals(partner, man);
        Assert.assertEquals(woman.getLastName(), "Doe");
    }
}
