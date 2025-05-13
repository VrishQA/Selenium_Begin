package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); //maximize window
		driver.manage().window().fullscreen();
		
		
		//locating the elements-- "tag id"
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//locating the elements-- "tag n class"
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iPhone16");
		
		//locating the elements-- "tag attribute"
		driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("iPhone16");
		
		//locating the elements-- "tag class n attribute"
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("iPhone16");
		driver.getCurrentUrl();
		
//		driver.quit();
//		driver.close();
		
	}

}
