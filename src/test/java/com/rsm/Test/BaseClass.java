package com.rsm.Test;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.rsm.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String RSMUrl = readconfig.getRSMUrl();
	public String email = readconfig.getEmail();
	public String password = readconfig.getPassword();
	public String email2 = readconfig.getEmail2();
	public String password2 = readconfig.getPassword2();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws MalformedURLException {
		
		if (br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//docker
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setBrowserName(BrowserType.CHROME);
//			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
//			//driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);
			
		} else if (br.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			//docker
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setBrowserName(BrowserType.FIREFOX);
//			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
//			//driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),cap);
			
		}
		
//		driver.get(RISEURL);
//		logger.info("RISE Base URL opened");
		logger = Logger.getLogger("RSM");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
