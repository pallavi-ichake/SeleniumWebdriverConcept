package HYRTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown 
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
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	    
	    //Singale selection value
	    //WebElement singalvalue =driver.findElement(By.id("course"));
	    Select se = new Select(driver.findElement(By.id("course"))); 
	    se.selectByIndex(1);
	    se.selectByValue("net");
	    se.selectByVisibleText("Python");
	    
	    //Multislection value
	    WebElement multivalue =driver.findElement(By.id("ide"));
	    Select se1 = new Select(multivalue); 
	    se1.selectByIndex(0);
	    se1.selectByValue("ij");
	    se1.selectByVisibleText("NetBeans");
	    
	    //Get option use
	    List<WebElement> courseAll = se.getOptions();
	    for(WebElement wb : courseAll)
	    {
	    	System.out.println(wb.getText());
	    }
	    
	    //selected options
	    List<WebElement> Selctopt = se1.getOptions();
	    for(WebElement wb : Selctopt)
	    {
	    	System.out.println(wb.getText());
	    }
	    
	    //
	    WebElement firstopt = se.getFirstSelectedOption();
	    {
	    	System.out.println(firstopt.getText());
	    }
	    
		

	}


}
