import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Functional_test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mdrahul/Documents/Udemy/Pratice/Driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       // Thread.sleep(3000);
        int j=0;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       String[] iteamsneed = {"Brocolli", "Beans","Beetroot"};

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
           String[] name = products.get(i).getText().split("-");
            String formartName=name[0].trim();
            //String name=products.get(i).getText();
            List itemsNeededList = Arrays.asList(iteamsneed);

           if (itemsNeededList.contains(formartName)){
               driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
               j++;

           }
           if (j==iteamsneed.length){
               break;
           }
        }
        driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
        }


    }

