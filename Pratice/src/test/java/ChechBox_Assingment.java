
import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
public class ChechBox_Assingment{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mdrahul/Documents/Udemy/Pratice/Driver/chromedriver 2");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());


    }
}