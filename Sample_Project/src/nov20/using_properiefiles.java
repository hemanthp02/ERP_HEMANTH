package nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class using_properiefiles {

	WebDriver driver;
	Properties conpro;
@BeforeTest
	public void setup() throws Throwable {
		conpro = new Properties();
		conpro.load(new FileInputStream("login.properties"));
		driver  = new ChromeDriver();
		driver.get(conpro.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void start_test() {
		driver.findElement(By.xpath(conpro.getProperty("USERNAME"))).sendKeys("Admin");
		driver.findElement(By.xpath(conpro.getProperty("PASSWORD"))).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath(conpro.getProperty("LOGINBUTTON"))).click();

		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if (actual.contains(expected)) {
			Reporter.log("login done --- " + expected + "        " + actual, true);
		} else {
			Reporter.log("login failed --- " + expected + "        " + actual, true);
		}
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	}