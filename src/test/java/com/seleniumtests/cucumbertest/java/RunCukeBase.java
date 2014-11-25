package com.seleniumtests.cucumbertest.java;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.seleniumtests.utility.Log;


public class RunCukeBase {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	public static int waitTime=10;

	public static String browser="chrome";
	public static String envURL="https://tbbqabeta.productpartners.com";
	public static String baseURL = envURL;
	public static Platform currentOS = Platform.getCurrent();

	protected static void getDriverInstance()
	{
		//so that multiple windows are not opened
		if(driver == null)
		{
			createDriver();
		}

	}

	protected static void createDriver() {

		System.out.println("Browser= "+browser);
		System.out.println("Platform= "+currentOS);
		System.out.println("URL= "+baseURL);

		createDriver(browser);
		//OpenURL(baseURL);
	}

	public static void createDriver(final String browserId)
	{
		if (browserId.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browserId.equalsIgnoreCase("ie"))
		{
			final File file = new File("src/test/resources/drivers/ieDriver/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

			DesiredCapabilities iecapabilities = DesiredCapabilities.internetExplorer();
			//iecapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			iecapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			iecapabilities.setJavascriptEnabled(true);
			driver = new InternetExplorerDriver(iecapabilities);
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}
		else if (browserId.equalsIgnoreCase("chrome"))
		{
			final File file = new File("src/test/resources/drivers/chromeDriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

			DesiredCapabilities chcapabilities = new DesiredCapabilities();
			chcapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("-test-type");
				chcapabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(chcapabilities);
				driver.manage().window().maximize();
		}
	}


	public static void OpenURL(String baseURL)
	{
		driver.manage().window().maximize();

		driver.get(baseURL);

		waitVar= new WebDriverWait( driver, waitTime );
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	public void tearDown() throws IOException
	{
		if(!(driver==null))
		{
			File imageFile = ((TakesScreenshot)driver)
					.getScreenshotAs(OutputType.FILE);
			String failureImageFileName = imageFile.getName();
			
			File failureImageFile = new File("C:\\D\\MySelWorkspaceBackups\\seleniumtestsbb\\screenshots\\"+failureImageFileName);
			FileUtils.copyFile(imageFile, failureImageFile);
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	
	public void closeBrowser(ITestResult result) throws IOException {
		//try{
		if (!result.isSuccess()) {
			try{
			Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX --FAILED-- XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		//	File imageFile = ((TakesScreenshot) new Augmenter().augment(driver))
		//			.getScreenshotAs(OutputType.FILE);
				File imageFile = ((TakesScreenshot)driver)
						.getScreenshotAs(OutputType.FILE);
			//String failureImageFileName = result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
			//		+ ".png";
			String failureImageFileName = imageFile.getName() + result.getMethod().getMethodName() + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
					+ ".png";
			File failureImageFile = new File("C:\\D\\MySelWorkspaceBackups\\seleniumtestsbb\\screenshots\\cucumber"+failureImageFileName);
			FileUtils.copyFile(imageFile, failureImageFile);
			}finally {
				driver.close();
				driver.quit();
				Log.endTestCase(result.getMethod().getMethodName());
				}
		}
		else if (result.isSuccess()){
			Log.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX --PASSED-- XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			driver.close();
			driver.quit();
			Log.endTestCase(result.getMethod().getMethodName());
		}
	}

}
