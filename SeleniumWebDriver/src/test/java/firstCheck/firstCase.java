package firstCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class firstCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver d= new ChromeDriver();
		//WebDriver dr = new SafariDriver();
		//WebDriver dr= new EdgeDriver();
		WebDriver dr= new ChromeDriver();//launch browser
		
		//open url
		dr.get("https://www.javatpoint.com/");
		
		//validate title
		String actualTitle=dr.getTitle();
		if(actualTitle.equals("Javatpoint Homepage")) {
			System.out.println("test pass");
			
		}else {
			
		System.out.println("test fail");
		
		}
		dr.close(); // or dr.quit();
		
	}

}
