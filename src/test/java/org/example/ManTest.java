package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {

    @Test
    public void testGetPartner() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);
        man.setPartner(woman);

        Woman partner = man.getPartner();

        Assert.assertEquals(partner, woman);
    }

    @Test
    public void testSetPartner() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);

        man.setPartner(woman);
        Woman partner = man.getPartner();

        Assert.assertEquals(partner, woman);
    }

    @Test
    public void testIsRetired() {
        Man man1 = new Man("John", "Doe", 40); // Not retired
        Man man2 = new Man("Adam", "Smith", 70); // Retired

        boolean isRetired1 = man1.isRetired();
        boolean isRetired2 = man2.isRetired();

        Assert.assertFalse(isRetired1);
        Assert.assertTrue(isRetired2);
    }

    @Test
    public void testRegisterPartnership() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);

        man.registerPartnership(woman);
        Woman partner = man.getPartner();

        Assert.assertEquals(partner, woman);
        Assert.assertEquals(woman.getLastName(), "Doe");
    }

    @Test
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);
        man.setPartner(woman);

        man.deregisterPartnership(false);
        Woman partner = man.getPartner();

        Assert.assertNull(partner);
        Assert.assertEquals(woman.getLastName(), "Smith");
    }
}
