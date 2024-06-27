package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class test05 {
	WebDriver driver;
  @Test
  public void linktest() {
	 List<WebElement> abc = driver.findElements(By.tagName("a"));
	 System.out.println(abc.size());
 
  }
  
  @Test
  public void imagelink() {
	 List<WebElement> xyz= driver.findElements(By.tagName("img"));
  System.out.println(xyz.size());
  }
  @BeforeClass
 public void beforeClass() {
 System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://www.yatra.com/ ");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
