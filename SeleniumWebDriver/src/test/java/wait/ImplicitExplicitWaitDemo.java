package wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ImplicitExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//implicit wait
		
//		WebDriver dr= new ChromeDriver();
//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		dr.get("https://www.saucedemo.com/");
//		dr.manage().window().fullscreen();
//		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		dr.findElement(By.id("login-button")).click();
//		
//		System.out.println("TestPass- Login with PopUp");
//		dr.manage().window().fullscreen();
//		dr.close();
		
		
		//explicit wait
//		WebDriver dr= new ChromeDriver();
//		WebDriverWait wait= new WebDriverWait(dr,Duration.ofSeconds(10));
//		dr.get("https://www.saucedemo.com/");
//		dr.manage().window().fullscreen();
//		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		dr.findElement(By.id("login-button")).click();
//		dr.manage().window().fullscreen();
//		
//		try {
//		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		    System.out.println("Alert Text: " + alert.getText());
//		    alert.accept();
//		} catch (TimeoutException e) {
//		    System.out.println("No alert present.");
//		}
//		
//		dr.close();
		
		
		//fluent wait
		WebDriver dr= new ChromeDriver();
		//declartion is must to use fluent wait
		Wait<WebDriver> wait= new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		
		
		//applying this wait where u need
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().fullscreen();
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		dr.manage().window().fullscreen();
		
		WebElement title= wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver dr) {
				return dr.findElement(By.xpath("//span[@class='title']"));
		}
	});
		
dr.close();
		
		
	}

}
