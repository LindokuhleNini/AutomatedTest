package africa.digilink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Automated Test Case.
 * Lindokuhle Nini
 */
public class AppTest {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        //Connect to the web driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        //Step 1: Login
        Thread.sleep(1000);
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        //Step 2: Add item to cart
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //Step 3: Go to basket
        Thread.sleep(1000);
        driver.findElement(By.id("shopping_cart_container")).click();

        //Step 3: Checkout
        Thread.sleep(1000);
        driver.findElement(By.id("checkout")).click();

        //Step 4: Enter personal info and continue
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Bangile");
        driver.findElement(By.id("last-name")).sendKeys("Mahlamvu");
        driver.findElement(By.id("postal-code")).sendKeys("7100");
        driver.findElement(By.id("continue")).click();

        //Step 5: Continue
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();

        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        AppTest test = new AppTest();
        test.setUp();
    }

}
