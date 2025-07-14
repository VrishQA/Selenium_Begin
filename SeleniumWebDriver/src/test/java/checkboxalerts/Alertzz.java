package checkboxalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertzz {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
	Alert alert=driver.switchTo().alert();
	String alertTitle=alert.getText();
	System.out.println(alertTitle);	
	alert.accept();
	driver.quit();
		
		
	}

}
