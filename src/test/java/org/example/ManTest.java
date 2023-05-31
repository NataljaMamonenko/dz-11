import org.example.Man;
import org.example.Woman;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ManTest {

    @Test(description = "validation of method testGetPartner()")
    public void testGetPartner() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);
        man.setPartner(woman);

        Woman partner = man.getPartner();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(partner, woman, "Partner is not retrieved correctly");
        softAssert.assertAll();
    }

    @Test(description = "validation of method testIsRetired()")
    public void testIsRetired() {
        Man man1 = new Man("John", "Doe", 40); // Not retired
        Man man2 = new Man("Adam", "Smith", 70); // Retired

        boolean isRetired1 = man1.isRetired();
        boolean isRetired2 = man2.isRetired();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(isRetired1, "Man1 should not be retired");
        softAssert.assertTrue(isRetired2, "Man2 should be retired");
        softAssert.assertAll();
    }

    @Test(description = "validation of method testRegisterPartnership()")
    public void testRegisterPartnership() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);

        man.registerPartnership(woman);
        Woman partner = man.getPartner();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(partner, woman, "Partner is not registered correctly");
        softAssert.assertEquals(woman.getLastName(), "Doe", "Last name is wrong for woman");
        softAssert.assertAll();
    }

    @Test(description = "validation of method testDeregisterPartnership()")
    public void testDeregisterPartnership() {
        Woman woman = new Woman("Anna", "Smith", 30);
        Man man = new Man("John", "Doe", 35);
        man.setPartner(woman);

        man.deregisterPartnership(false);
        Woman partner = man.getPartner();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNull(partner, "Partnership is not deregistered correctly");
        softAssert.assertEquals(woman.getLastName(), "Smith", "Last name is wrong for woman");
        softAssert.assertAll();
    }
}
