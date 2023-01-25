package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchBoxTest {

	
		@SuppressWarnings("deprecation")
		public List<WebElement> searchTest(String key) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		WebElement w = driver.findElement(By.name("q"));
		w.sendKeys(""+key);
		List <WebElement> lst = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class='wM6W7d']"));
		return lst;
		}
	

}
