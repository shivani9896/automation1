package mavenproject1.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
driver.get(" https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("shivi");
}

}