import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlazeDemoProject {

	public static void main(String[] args) {
		//choose your own origin and destination, then from that pick the least price from list and then book a flight

		WebDriver driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

		driver.get("https://blazedemo.com");
		
		driver.manage().window().maximize();
	String Title=	driver.getTitle();
	System.out.println(Title);
		
		String title= "BlazeDemo";
		 if(Title.equals(title)) {
			System.out.println("Title of the page is:--> Valid "); 
		 }else {
			 System.out.println("Title of the page is:--> Invalid Title");
		 }
		 
		 //click on dropdown to choose place
		WebElement element= driver.findElement(By.xpath("//select[@name='fromPort']"));
		//element.click();
		
		
		//list of start and destination places
		 Select start= new Select(element);
		List<WebElement> value= start.getOptions();
		for(WebElement options:value) {
		
			System.out.println("Place of Origin ->"+ options.getText());
		}
		
		
		
		WebElement elementz= driver.findElement(By.xpath("//select[@name='toPort']"));
		 Select destination= new Select(elementz);
		List<WebElement> values= destination.getOptions();
		for(WebElement option:values) {
			
			System.out.println("Place of Destination ->"+ option.getText());
		}
		
		 //select a value fromPort and toPort
		start.selectByIndex(5);
		destination.selectByIndex(5);
		//find flights
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		

		// wait for table rows to be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table']//tbody//tr")));

		
		 
		//get the table and count the no.of rows and cells
	int row=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
	System.out.println(row);
	
	int cell=driver.findElements(By.xpath("//table[@class='table']//thead//tr[1]//th")).size();
	System.out.println(cell); 
		 ////table[@class='table']//tbody//tr[5]//td[6]
	
	//find the least available price from price column
	System.out.println("Price of all flights based on start and destination selected");
	

	List<Double> prices= new ArrayList<>();
	for(int r=1;r<=row;r++) {
	String vlue=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
	vlue=vlue.replace("$", "");
	double price=Double.parseDouble(vlue);
	prices.add(price);
	
	}
	

	Collections.sort(prices);
	System.out.println(prices);
	
	
	
	for(int r=1;r<=row;r++) {
		
		String valuez=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
		valuez=valuez.replace("$", "");
		double val=Double.parseDouble(valuez);
		
		if(val==prices.get(0)) {
			System.out.println("Clicking on least availble price");
			WebElement chooseFlight=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]//input[@type='submit']"));
			chooseFlight.click();
			break;
		}
	}
	
	//fill in the final details
	driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Rishab");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Bangalore 1234");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
	driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("560068");
	WebElement cardd=driver.findElement(By.xpath("//select[@id='cardType']"));
	Select card= new Select(cardd);
	card.selectByIndex(2);
	driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("3322500100");
	WebElement month=driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
	month.clear();
	month.sendKeys("10");
	WebElement year=driver.findElement(By.xpath("//input[@id='creditCardYear']"));
	year.clear();
	year.sendKeys("2030");
	driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Vrishab H");
	driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
	driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]")).isDisplayed();
	
	
	
	driver.quit();
	}
	}





//List<Double> prices= new ArrayList<>();
//for (int r=1;r<=row;r++) {
//
//	
//	String cost=	driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
//	cost=cost.replace("$", "");
//	double price= Double.parseDouble(cost);
//	prices.add(price);
//	}
//
//Collections.sort(prices);
//System.out.println(prices);
//
//System.out.println("Cheapest flight rate is as below");
//
//System.out.println(prices.get(0));
