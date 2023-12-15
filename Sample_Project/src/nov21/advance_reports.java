package nov21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class advance_reports {

	ExtentReports reports;
	ExtentTest logger;
	WebDriver driver;

	@BeforeTest
	public void generateReport() {

		reports = new ExtentReports("./extentreports/demo.html");

	}

	@BeforeMethod
	public void steUp();

	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}

	@Test
	 public void passTest()
	 {
		 reports.startTest("passtest");
		 logger.assignAuthor("hemanth");
		 logger.assignCategory("functonal");
		 String expected = google;
		 String actual = driver.getTitle();
		 if(expected.equalsIgnoreCase(actual));
		 {
			 logger.log(LogStatus.PASS, "title is matched --"+ expected+"           " + actual);
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL, "title is not-matched --"+ expected+"           " + actual);
		 }
	 }

	@Test
	 public void failTest()
	 {
		 reports.startTest("passtest");
         logger.assignAuthor("hemanth");
		 logger.assignCategory("functonal");
		 String expected = gmail;
		 String actual = driver.getTitle();
		
		 if(expected.equalsIgnoreCase(actual));
		 {
			 logger.log(LogStatus.PASS, "title is matched --"+ expected+"           " + actual);
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL, "title is not-matched --"+ expected+"           " + actual);
		 }
	 }
}
