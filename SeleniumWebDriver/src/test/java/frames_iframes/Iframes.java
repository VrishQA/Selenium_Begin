package frames_iframes;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		try {
		driver.get("https://ui.vision/demo/webtest/frames/");// launching of url
		driver.manage().window().maximize();
		
		//from main page shift driver to frame1 by getting its id/name
		WebElement fr1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(fr1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1 Identified");

		//now shifting to frame2 from frame1
		
		//directly u cannot switch to frame--> come out of frame1 to default then shift to frame2
		
		//shifting to default page
		driver.switchTo().defaultContent();
		
		WebElement fr2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(fr2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame2 Identified");
		
		//shifting to default page
				driver.switchTo().defaultContent();
				WebElement fr3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
				driver.switchTo().frame(fr3);
				driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame3 Identified");
				
				//shifting to inner-frame tp handle i-frame within frame3
				driver.switchTo().frame(0);	
				driver.findElement(By.cssSelector("label[for='i9'] div[class='bzfPab wFGF8']")).click();
		
				driver.switchTo().defaultContent();
				
				
				WebElement fr5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
				driver.switchTo().frame(fr5);
				driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame5 Identified");
				
				//get window handle
				String originalWindow = driver.getWindowHandle();
				

				//now click on the link of frame
				driver.findElement(By.linkText("https://a9t9.com")).click();
				
				//now switch to new window
				for (String windowHandle : driver.getWindowHandles()) {
				    if (!originalWindow.contentEquals(windowHandle)) {
				        driver.switchTo().window(windowHandle);
				        break;
				    }
				}

				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")));  // Adjust if needed

				
				
		System.out.println("cases executed");
		}catch(Exception e) {
			e.printStackTrace();}
			finally {
				for (String handle : driver.getWindowHandles()) {
				    driver.switchTo().window(handle);
				    driver.close();
				}

			}
		driver.quit();

		
		
	}

}
