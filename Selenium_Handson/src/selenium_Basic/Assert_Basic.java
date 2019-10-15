package selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert_Basic {

	SoftAssert sAssert=new SoftAssert();
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
//		WebElement gmailLink;
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		gmailLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='gb_e'])[1]")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementByClassName('gLFyf gsfi').value='test'");
		String s=driver.getTitle();
		//Assert.assertEquals(s, "Google1");
		sAssert.assertEquals(s, "Google1");
		Thread.sleep(10);
		driver.quit();
		sAssert.assertAll();
		
	}
	
}
