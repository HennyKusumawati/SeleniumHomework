package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

//profileID
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("profile Id");
//find the profile box
        WebElement profileBox=driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("profile");
//feedback1
        WebElement feedback1=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedback1.sendKeys("Jenny");
//feedback2
        WebElement feedback2=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedback2.sendKeys("Raj");
//email
        WebElement email= driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("selenium@gmail.com");
//course topic
        WebElement courseTopic=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
//intro to Advance
        WebElement intro=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("introduction");

        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("conclusion");

    }
}
