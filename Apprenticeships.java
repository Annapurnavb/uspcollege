package a.palmers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apprenticeships {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Annapurna.Badiger\\eclipse-workspace\\ann\\uspcollege\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://umbraco.uspcollege.ac.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Accept']")).click();

		// login
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("anna@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("uuqs1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();

		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("Apprenticeships");
		driver.findElement(By.id("single-select1")).sendKeys("Palmer's");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 3

//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("snowman");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("snowgirl");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("snmli");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("ndk");
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("15/06/1986");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 4

//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("asa12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("oddddsud6");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("we12df");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("lossiemouth");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("208949949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("28990sj");
		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("anna@gmail.com");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 5

//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("osdlki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("loklio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("dkofdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("02472 582");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("lnnkkx@gmail.com");
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 6
		driver.findElement(By.id("single-select")).sendKeys("Traineeships");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		
		// step 9
//		driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("hdsaddc");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("social");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("french");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("C");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/input")).click();

		// step 10
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Irish");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("jhdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("kklid");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("mnhsc");
//		Thread.sleep(3000);
//
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[29]/div[1]/label")).click(); // Yes
//
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[34]/label")).click();// no
		js.executeScript("window.scrollBy(0,2800)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 11
		js.executeScript("window.scrollBy(0,3200)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div/form/input[1]")).click();
		
		// step 12
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();
		driver.findElement(By.id("single-select")).sendKeys("Banner outside Seevic & Palmer's Campus");
		driver.findElement(By.id("single-select1")).sendKeys("Financial Sector & Professional Services ");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

	}

}
