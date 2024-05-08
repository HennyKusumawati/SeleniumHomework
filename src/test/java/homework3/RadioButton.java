package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement maleRb = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        maleRb.click();

// HW : enabled the disabled Radio Button
        WebElement enableRb = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableRb.click();

// HW: click one option (Male/Female) after button is enabled
        WebElement maleRb2 = driver.findElement(By.xpath("//input[@value='gender-male']"));
        maleRb2.click();

//click Male on the Radio Button Group
        WebElement maleRb3 = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
        maleRb3.click();

//select from 3 options of the radio button
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioButton : radioButtons) {
            String value = radioButton.getAttribute("value");
            if (value.equalsIgnoreCase("15 - 50")) {
                radioButton.click();
                break;//we use break just in case we found the desired element before all iteration
            }
        }
//click get value on the Radio Button Group Demo
        WebElement getValue = driver.findElement(By.xpath("//button[@onclick='getValues();']"));
        getValue.click();


    }
}
