package HYRTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesireCaps {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);

		WebDriver driver=new ChromeDriver(cap);
	    driver.get("http://www.cacert.org/");
	    driver.manage().window().maximize();
		

	}

}
