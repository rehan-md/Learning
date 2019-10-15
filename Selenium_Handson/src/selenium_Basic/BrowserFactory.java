package selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		String browser="firefox";
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver_win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Alerts & Modals')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Javascript Alerts')])[2]")).click();
		driver.findElement(By.xpath("(//button[@class['btn btn-default']])[2]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
	}
}
