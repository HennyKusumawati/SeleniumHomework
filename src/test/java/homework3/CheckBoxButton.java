package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //  for(WebElement allChBox:checkBox){
        //   allChBox.click();   // => to check all checkBoxes
        // }

        for (WebElement chBox : checkBox) {
            String value = chBox.getAttribute("value");
            if (value.equalsIgnoreCase("Option-2")) {
                chBox.click();
            }
        }

        //HW: under disabled checkbox demo, click on enable checkboxes
        WebElement enableChBox = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableChBox.click();

        //HW select option 4
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement option : options) {
            String value = option.getAttribute("value");
            if (value.equalsIgnoreCase("Checkbox-4")) {
                option.click();
            }
        }


    }
}
