import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2End_assingment2{
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","/Users/mdrahul/Documents/Udemy/Pratice/Driver/chromedriver 2");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.cleartrip.com/");
            driver.findElement(By.id("DepartDate")).click();
            driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
            Select s=new Select(driver.findElement(By.id("Adults")));
            s.selectByIndex(1);
            Select s2=new Select(driver.findElement(By.id("Childrens")));
            s2.selectByValue("2");
            driver.findElement(By.id("MoreOptionsLink")).click();
            driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirate");
            driver.findElement(By.id("SearchBtn")).click();
            System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

        }
    }

