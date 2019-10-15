package selenium_Basic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.zebco.com/");
		String title=driver.getTitle();
		System.out.println(title);
		List <WebElement> listelement=driver.findElements(By.tagName("a"));
		for(int i=0; i<listelement.size();i++) {
			if(listelement.get(i).getAttribute("href") !=null && listelement.get(i).getAttribute("href").contains("http")) {
		
			String url=listelement.get(i).getAttribute("href");
			
			verifyActiveLink(url);
		}
			
			}
	}
	public static void verifyActiveLink(String linkUrl) {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection urlConnect=(HttpURLConnection)url.openConnection();
			urlConnect.setConnectTimeout(10000);
			urlConnect.connect();
			if(urlConnect.getResponseCode()==200) {
				System.out.println(linkUrl+" - "+urlConnect.getResponseMessage());
			}
			else {
				System.out.println(linkUrl+" - "+urlConnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
		catch (Exception e) {
			
		}
	}
	
}
