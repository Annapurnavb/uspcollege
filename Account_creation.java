package a.palmers;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account_creation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Annapurna.Badiger\\eclipse-workspace\\ann\\uspcollege\\jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://umbraco.uspcollege.ac.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Accept']")).click();
		driver.findElement(By.cssSelector("li.desktop-only a[href*='courses-apprenticeships']")).click();
		driver.findElement(By.cssSelector("a[href*='apply/create-an-account']")).click();
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("fna@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("frruqs1234");
		driver.findElement(By.cssSelector("#RepeatPassword")).sendKeys("frruqs1234");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".checkbox label[for='AgreeToPrivacyStatement']")).click();
		JOptionPane.showMessageDialog(null, "Please enter the Captcha and click OK");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'mainContent\']/div/div/div[3]/div/form/p[3]/input")).click();
		driver.quit();
	}

}
