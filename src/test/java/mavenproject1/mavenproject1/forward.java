package mavenproject1.mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver()	;
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		String abc =driver.getTitle();
		Thread.sleep(2000);
		System.out.println("get tiitle :" +abc);
		
		//driver.close();
		driver.navigate().to("https://demo.automationtesting.in/Register.html ");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
