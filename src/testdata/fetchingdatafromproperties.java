package testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fetchingdatafromproperties

{
	@Test
	public void fdfpf() throws IOException
	{
		FileInputStream fis=new FileInputStream("./config.properties");
	Properties properties=new Properties();
	properties.load(fis);
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(properties.getProperty("url"));
	driver.findElement(By.id(properties.getProperty("usernamelocator"))).sendKeys(properties.getProperty("username"));
	driver.findElement(By.xpath(properties.getProperty("passwordlocator"))).sendKeys(properties.getProperty("password")); 
	driver.findElement(By.xpath(properties.getProperty("login"))).click();
	
	
	
	
	}
}
