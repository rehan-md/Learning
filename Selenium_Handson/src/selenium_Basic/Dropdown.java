package selenium_Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select dd=new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dd.selectByVisibleText("Wednesday");
		
		
	}
}
