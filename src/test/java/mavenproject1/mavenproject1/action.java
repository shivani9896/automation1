package mavenproject1.mavenproject1;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		driver.manage().window().maximize();
driver.get("https://www.yatra.com/ ");
WebElement abc=driver.findElement(By.xpath(" //span[@class='demo-icon icon-hotels']"));

Actions act =new Actions(driver);
act.contextClick(abc).build().perform();

WebElement kbc1=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
Actions act1 =new Actions(driver);
act1.moveToElement(kbc1).perform();
driver.close();




 
}
}
