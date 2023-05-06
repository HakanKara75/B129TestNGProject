package techproed.tests.day28_Listeners;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.Assert.assertTrue;
@Listeners(techproed.utilities.Listeners.class)
public class C01_Listeners {
    @Test
    public void succesTest() {
        System.out.println("PASS");
        assertTrue(true);
    }
    @Test
    public void failTest() {
        System.out.println("FAIL");
        assertTrue(false);
    }
    @Test
    public void scipTest() {
        System.out.println("SKIP");
        assertTrue(true);
        throw new SkipException("Atlandi");
    }
    @Test
    public void failTestTechpro() {
        System.out.println("Techpro FAIL test");
        Driver.getDriver().get(ConfigReader.getProperty("techproeducation_Url"));

        Driver.getDriver().findElement(By.xpath("//olmayanXPath"));

        assertTrue(false);
    }

}
