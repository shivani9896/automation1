package mavenproject1.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver()	;
		driver.get(" https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
        driver.findElement(By.xpath(" //a[normalize-space()='Alert with OK']")).click();
        driver.findElement(By.xpath(" //button[contains(text(),'click the button to display an')]']")).click();
	driver.switchTo().alert().accept();
	}

}
