package POM_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testScript 
{
	@Test
	private void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Pom p = new Pom(driver);
		p.amazon_button();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.amazon_button();

	}
}