package mavenproject1.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		driver.manage().window().maximize();
	WebElement txt = driver.findElement(By.xpath("input[placeholder='Username']"));
    txt.sendKeys("Admin");
    
    WebElement rdx = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    rdx.sendKeys("admin123");
    
    WebElement cdx = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    cdx.click();	
}
}
