package org.Lumu;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    protected WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webDriver.chrome.driver","//LUMU/src/test/java/resources/drivers/chromedriver_126.0.6478.62.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordcounter.net/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
