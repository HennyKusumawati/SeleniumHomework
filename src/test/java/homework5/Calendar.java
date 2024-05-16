package homework5;
 /*
    hw
goto syntax hrms
login
click on leave
    from calendar select any date of your choice
     I CHOOSE December, 11, 1950 => 1950,12,11

     */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).click();

        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selMm = new Select(month);
        selMm.selectByVisibleText("Dec");

        WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selYy= new Select(year);
        selYy.selectByVisibleText("1950");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : dates) {
            if (date.getText().equals("11")) {
                date.click();
                break;
            }


        }

    }
}
