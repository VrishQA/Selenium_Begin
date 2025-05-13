package locators;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  dr = new ChromeDriver();//launch chrome browser
		dr.get("https://www.javatpoint.com"); // hit the url
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to get current url n verify the url
		String url= dr.getCurrentUrl();
		System.out.println(url);
		



		//maximize the browser
		dr.manage().window().fullscreen();
		//System.out.println("done");
		
	//boolean logo= dr.findElement(By.className("navbar navbar-expand-lg navbar-light px-4 py-lg-0")).isDisplayed();
		
		//locating by name
		dr.findElement(By.name("search")).sendKeys("java");
		System.out.println("done");
		
		//locating a linkText
		dr.findElement(By.linkText("Python")).click();
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
	List<WebElement> headerLinks=dr.findElements(By.className("nav-item"));
	System.out.println("Total no.of headerLinks" + headerLinks.size());
	
	List<WebElement>links=dr.findElements(By.tagName("a"));
	System.out.println("Total no.of Links" + links.size());
	
	
	List<WebElement>img=dr.findElements(By.tagName("img"));
	System.out.println("Total no.of Images" + img.size());
		
		//locating by class
//		dr.findElement(By.className("nav-link"));
//		System.out.println("done");
		dr.close();
		
		
		
	}

}
