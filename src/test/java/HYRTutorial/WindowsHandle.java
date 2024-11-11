package HYRTutorial;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.merge(cap);
		
		WebDriver driver=new ChromeDriver(option);
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    String parentwindow = driver.getWindowHandle();
	    System.out.println(parentwindow);
	    
	    driver.findElement(By.className("whButtons")).click();
	    Set<String> handles = driver.getWindowHandles();
	    for(String he :handles)
	    {
	    	System.out.println(he);
	    }
	    
	}
}