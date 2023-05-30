import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomanTest {

    @Test(description = "перевірка методу testGetPartner()")
    public void testGetPartner() {
        Man man = new Man("John", "Doe", 35);
        Woman woman = new Woman("Anna", "Smith", 30);
        woman.setPartner(man);

        Man partner = woman.getPartner();

        Assert.assertEquals(partner, man);
    }

    @Test(description = "перевірка методу testGetMaidenName()")
    public void testGetMaidenName() {
        String maidenName = "Johnson";
        Woman woman = new Woman("Anna", "Smith", 30);
        woman.setMaidenName(maidenName);

        String retrievedMaidenName = woman.getMaidenName();
        Assert.assertEquals(retrievedMaidenName, maidenName);
    }

    @Test(description = "перевірка методу testIsRetired()")
    public void testIsRetired() {
        Woman woman1 = new Woman("Anna", "Smith", 50); // Not retired
        Woman woman2 = new Woman("Jane", "Doe", 65); // Retired

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(woman1.isRetired());
        softAssert.assertTrue(woman2.isRetired());
        softAssert.assertAll();
    }

    @Test(description = "перевірка методу testRegisterPartnership()")
    public void testRegisterPartnership() {
        Man man = new Man("John", "Doe", 35);
        Woman woman = new Woman("Anna", "Smith", 30);

        woman.registerPartnership(man);
        Man partner = woman.getPartner();

        Assert.assertEquals(partner, man);
        Assert.assertEquals(woman.getLastName(), "Doe");
    }

    @Test(description = "перевірка методу testDeregisterPartnership()")
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
