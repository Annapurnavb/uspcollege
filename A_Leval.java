package a.palmers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Leval {

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
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("pslp@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("ssss1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();

		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("A-Level");
		driver.findElement(By.id("single-select1")).sendKeys("Palmer's");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 3

//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("book1");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("sddxd");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("sdsddg");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("wfegvk");
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("29/11/2018");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 4

//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("asdssfdcs12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("axddsj34");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("aw61d5fh");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("inverness");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("2089849949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("2878800");
		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("pslp1@gmail.com");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 5

//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("dcosdlki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("lkkoklio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("doupfdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("024729582");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("asnnkkx@gmail.com");
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 6

//		driver.findElement(By.id("single-select")).sendKeys("3D Design & Architecture");//A-level and palmer's
//		driver.findElement(By.id("single-select1")).sendKeys("Accounting");
//		driver.findElement(By.id("single-select2")).sendKeys("Biology");

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[4]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 7

		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[5]/input")).click();

		// step 9
//				driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("adaddc");
//				driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("scince");
//				driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("english");
//				driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("A");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/input")).click();

		// step 10

//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("English/Welsh/Scottish/Northern/British");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("dcdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("dhjd");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("sdsjsc");
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
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Facebook");
//		driver.findElement(By.id("single-select1")).sendKeys("Creative & Digital");
//		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
	}

}
