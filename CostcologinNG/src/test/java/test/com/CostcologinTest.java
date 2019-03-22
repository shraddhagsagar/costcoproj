/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author vinot
 */
public class CostcologinTest {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    public CostcologinTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe");
        
        driver = new ChromeDriver();
    
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.quit();
    }
    @Test
     public void testCostoLoginTestCase() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.findElement(By.id("logonId")).clear();
    driver.findElement(By.id("logonId")).sendKeys("srinitribo@yahoo.com");
    driver.findElement(By.id("logonPassword")).click();
    driver.findElement(By.id("logonPassword")).clear();
    driver.findElement(By.id("logonPassword")).sendKeys("Sto1robo");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember Me'])[1]/following::input[1]")).click();
    try {
      assertEquals("Welcome to Costco Wholesale", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::i[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Preferences'])[1]/following::input[1]")).click();
  }
     @Test
    public void testCostcoinvalidloginTestCase() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.findElement(By.id("logonId")).clear();
    driver.findElement(By.id("logonId")).sendKeys("sams@gmail.com");
    driver.findElement(By.id("logonPassword")).click();
    driver.findElement(By.id("logonPassword")).clear();
    driver.findElement(By.id("logonPassword")).sendKeys("heloo123");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember Me'])[1]/following::input[1]")).click();
  }
    
    @Test
  public void testCostcoinvalidpassTestCase() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.findElement(By.id("logonId")).clear();
    driver.findElement(By.id("logonId")).sendKeys("srinitribo@yahoo.com");
    driver.findElement(By.id("logonPassword")).click();
    driver.findElement(By.id("logonPassword")).clear();
    driver.findElement(By.id("logonPassword")).sendKeys("sto23456");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember Me'])[1]/following::input[1]")).click();
  }
}
