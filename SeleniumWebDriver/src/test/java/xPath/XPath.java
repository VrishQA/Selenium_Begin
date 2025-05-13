package xPath;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		dr.manage().window().fullscreen();
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		Thread.sleep(5000);// to close password popup
		System.out.println("TestPass- Login with PopUp");
		dr.manage().window().fullscreen();
		
		//XPATH WITH MULTIPLE ATTRIBIUTES//
		dr.findElement(By.xpath("//button[@id='react-burger-menu-btn'][text()='Open Menu']")).click();
		//here normal click didnt worked so we used below method to click that paticular element//
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='react-burger-cross-btn']")));
		clickable.click();

		//dr.findElement(By.xpath("//button[@id='react-burger-cross-btn']")).click();
		//dr.findElement(By.id("react-burger-cross-btn")).click();//a[text()='All Items'] or use this as xpath
		System.out.println("TestPass- open hamburger");
		
		
		WebElement ele = dr.findElement(By.xpath("//div[normalize-space(text())='Sauce Labs Backpack']"));
		if(ele.isDisplayed()== true) {
			ele.click();
		}
		System.out.println("Element- Sauce Labs Clicked");

		//using and or operator with xpath
	
	WebElement el=	dr.findElement(By.xpath("//img[@alt='Sauce Labs Backpack' and @class='inventory_details_img']"));
	System.out.println(el.isDisplayed());	
		
	WebElement ell=	dr.findElement(By.xpath("//button[@id='add-to-cart' or @class='btn btn_primary btn_small btn_inventory']"));
	System.out.println(ell.isDisplayed());
	
	
	//using contains method in xpath, n in contains method value can be partial or full
	dr.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
	// Locate the span using class or data-test attribute
	WebElement cartCount = dr.findElement(By.xpath("//span[@class='shopping_cart_badge']"));

	// Get the inner text (i.e., the count)
	String countText = cartCount.getText();

	// Convert it to integer for validation
	int actualCount = Integer.parseInt(countText);

	// Expected count
	int expectedCount = 1;

	// Verify
	if (actualCount == expectedCount) {
	    System.out.println("✅ Cart count is correct: " + actualCount);
	} else {
	    System.out.println("❌ Cart count mismatch! Found: " + actualCount + ", Expected: " + expectedCount);
	}

	
	//remove from cart and verify the count in cart
	dr.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    dr.findElement(By.xpath("//div[@class='item_pricebar']/button[@id='remove-sauce-labs-backpack']")).click();
    
    //reclicking on cart button
   WebElement cartCheck= dr.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
   String cartValue=cartCheck.getText();
   if(cartValue.isEmpty()) {
	   System.out.println("Cart is Empty");
   }
    
//	 
//	 String countText1= cartCount.getText();
//	 System.out.println(countText1);

//		// Convert it to integer for validation
//		int actualCounter = Integer.parseInt(countText1);
//	 //now check the cart count
//	int expectedCounter=0;
//	if (actualCounter == expectedCounter) {
//	    System.out.println("✅ Cart count is correct: " + actualCounter);
//	} else {
//	    System.out.println("❌ Cart count mismatch! Found: " + actualCounter + ", Expected: " + expectedCounter);
//	}
	}

}
