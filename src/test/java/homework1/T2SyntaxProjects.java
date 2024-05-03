package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2SyntaxProjects {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/input-form-locator.php");
        //Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Henny");
        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Kusuma");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("hennyhenny@gmail.com");
        WebElement submit= driver.findElement(By.id("submit_button"));
        submit.click();
        WebElement clickHere= driver.findElement(By.linkText("Click Here."));
        clickHere.click();
        WebElement link=driver.findElement(By.linkText("Link"));
        link.click();

    }
}
