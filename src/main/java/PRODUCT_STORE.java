import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class PRODUCT_STORE {
@Test
public void StartTest() throws  InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
//    scroll
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  driver.get("https://www.demoblaze.com/");
    Thread.sleep(5000);
    WebElement Login = driver.findElement(By.id("login2"));
   Login.click();

   WebElement UserName = driver.findElement(By.id("loginusername"));
   UserName.sendKeys("Learn");
   WebElement Password= driver.findElement(By.id("loginpassword"));
   Password.sendKeys("learn123");
//   click login btn
   WebElement Login2= driver.findElement(By.xpath("//button[@onclick='logIn()']"));
   Login2.click();
    Thread.sleep(3000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='itemc'])[3]")));
//     categories list item by index
   WebElement Cat = driver.findElement(By.xpath("(//a[@id='itemc'])[3]"));
   Cat.click();
//     Thread.sleep(3000);
    js.executeScript("arguments[0].scrollIntoView();", Cat);
//    js.executeScript("window.scrollBy(0,1000)");
//    Thread.sleep(3000);
     WebElement Apple= driver.findElement(By.className("hrefch"));
    Apple.click();
//    Thread.sleep(3000);
//    cart add btn
     WebElement Cart=driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
     Cart.click();
//    Thread.sleep(3000);
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-lg']")));
    wait.until(ExpectedConditions.alertIsPresent());
    driver.switchTo().alert().accept();
//    Thread.sleep(3000);
//    goto home page
     WebElement Logo= driver.findElement(By.xpath("//a[@id='nava']//img"));
   Logo.click();
//    Thread.sleep(1000);
    WebElement Text= driver.findElement(By.xpath("//a[@id='nava']//img"));
    Text.click();

    WebElement Text1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
    System.out.println(Text1.getText());
    assertTrue(Text1.getText().contains("Welcome Learn"));
    driver.close();





}



}
