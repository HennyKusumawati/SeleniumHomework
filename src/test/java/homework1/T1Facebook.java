package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Henny");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Kusuma");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("KusumaHenny@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("abracadabra");

    }
}
