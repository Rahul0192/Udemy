import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Window_handle_assingment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mdrahul/Documents/Udemy/Pratice/Driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        driver.findElement(By.linkText("Click Here")).click();
       Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parent=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
         System.out.println("Switch to child window = "+driver.findElement(By.xpath("//div/h3")).getText());
         driver.switchTo().window(parent);
        System.out.println("Switch back to parent = "+driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());


            }
        }

