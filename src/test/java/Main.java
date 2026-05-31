
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    @Test
    public void WebTesting(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simpad-frontend.vercel.app/");
        WebElement Hero = driver.findElement(By.id("Upper"));

        if(Hero.isDisplayed() && Hero.isEnabled()){
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    @Test
    public void BranchTesting(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://simpad-frontend.vercel.app/");
        WebElement Hero = driver.findElement(By.id("Upper"));

        if(Hero.isDisplayed() && Hero.isEnabled()){
            System.out.println("Edan");
        } else {
            System.out.println("Error Lek");
        }
    }
}

