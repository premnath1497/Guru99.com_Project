package com.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.pageObjects.HomePage;
import com.pageObjects.MobilePage;
import com.pageObjects.ShopingCartPage;
import com.pageObjects.SonyExperiaPage;

public class TestBase {

	public static WebDriver driver;
	public HomePage home;
	public MobilePage mobile;
	public SonyExperiaPage sonymobilePage;
	public ShopingCartPage shopingCartPage;

	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional("Chrome")String br) {
		if (br.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("Firefox")) {
//			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (br.equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Please provide correct browser name");
		}

		driver.get(TestData.livetechUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		home = new HomePage();
		mobile = new MobilePage();
		sonymobilePage = new SonyExperiaPage();
		shopingCartPage = new ShopingCartPage();

	}

	public static void screenshot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String timeStamp = sdf.format(d);
		File destination = new File(".\\ScreenShot\\verifyDrodownSelectbyNameText" + timeStamp + ".png");
		FileHandler.copy(source, destination);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
