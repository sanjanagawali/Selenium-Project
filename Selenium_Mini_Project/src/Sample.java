import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	public String baseUrl = "http://127.0.0.1:8000/";
	String driverPath = "D:\\geckodriver.exe";
	public WebDriver driver;
	
	//homePage
	@Test(priority=1)
	public void test1()
	{
		  System.setProperty("webdriver.gecko.driver",driverPath);
		  driver = new FirefoxDriver();
	      driver.get(baseUrl);
		  driver.manage().window().maximize();
	      String expectedTitle = "Auction site";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();		
	}
	
  	   //signup
	  	@Test(priority=2)
		public void test2() 
	  	{
			  driver = new FirefoxDriver();
		      driver.get(baseUrl);
			  driver.manage().window().maximize();	  		
			  driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
		      String expectedTitle = "signup";
		      String actualTitle = driver.getTitle();
		      Assert.assertEquals(actualTitle, expectedTitle);
		      //driver.close();		
		}

		//register
	@Test(priority=3)
	public void test3() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("Joey");
		  driver.findElement(By.xpath("//input[@id='id_first_name']")).sendKeys("joey");
		  driver.findElement(By.xpath("//input[@id='id_last_name']")).sendKeys("tribbiani");
		  driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("joeyt@gmail.com");
		  driver.findElement(By.xpath("//input[@id='id_password1']")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//input[@id='id_password2']")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//button[@class='btn btn-dark-blue btn-block']")).click();		
	      String expectedTitle = "Auction site";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	}
	
	//login1
	@Test(priority=4)
	public void test4() {
		  driver = new FirefoxDriver();
	      driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("id_username")).sendKeys("Joey");
		  driver.findElement(By.id("id_password")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	      String expectedTitle = "Product page";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      //driver.close();		
	}
	
	//boughtProducts
	@Test(priority=5)
	public void test5() throws InterruptedException {
		  driver.findElement(By.xpath("//a[contains(text(),'Bought')]")).click();
		  Thread.sleep(2000);
	      String expectedTitle = "Bought Products";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      //driver.close();		
	}

	//soldProducts
	@Test(priority=6)
	public void test6() {
		  driver.findElement(By.xpath("//a[contains(text(),'Sold')]")).click();		
	      String expectedTitle = "Sold Products";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	     // driver.close();
	}
	
	//myProducts
	@Test(priority=7)
	public void test7() {
		  driver.findElement(By.xpath("//a[contains(text(),'My Product')]")).click();
	      String expectedTitle = "My Products";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      //driver.close();
	}

	//logout
	@Test(priority=8)
	public void test8() {
		  driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
	      String expectedTitle = "Auction site";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();		
	}
/*	
	//login2
	@Test(priority=9)
	public void test9() {
		  driver = new FirefoxDriver();
	      driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("id_username")).sendKeys("Ross");
		  driver.findElement(By.id("id_password")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	      String expectedTitle = "Product page";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();		
	}
	
	//login3
	@Test(priority=10)
	public void test10() {
		  driver = new FirefoxDriver();
	      driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("id_username")).sendKeys("Chandler");
		  driver.findElement(By.id("id_password")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	      String expectedTitle = "Product page";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();		
	}
	

	//login4
	@Test(priority=11)
	public void test11() {
		  driver = new ChromeDriver();
	      driver.get(baseUrl);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("id_username")).sendKeys("Sheldon");
		  driver.findElement(By.id("id_password")).sendKeys("abcd@123");
		  driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	      String expectedTitle = "Product page";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();		
	}
*/	
	
}

