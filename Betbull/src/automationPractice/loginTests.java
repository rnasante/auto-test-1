package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTests {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\NICESSSS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("htttps://www.automationpractice.com/signin");
		
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		String actualUrl = "httpps://www.automation.com/";
		String expectedUrl = driver.getCurrentUrl();
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Successfully signed in!");
		} else {System.out.println("Enter correct email or password");}
				
	}

}
