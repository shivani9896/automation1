package mavenproject1.mavenproject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\eclipse-workspace\\mavenproject1\\drivers\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		TakesScreenshot tss = (TakesScreenshot)driver;
	    File srcc = tss.getScreenshotAs(OutputType.FILE);
	    File filee = new File("D:\\screenshot.png");
	    try {
	    	 FileUtils.copyFile(srcc, filee);
	    }
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
