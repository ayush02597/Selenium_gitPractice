package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		//driver.findElement(By.linkText("Register"));
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.partialLinkText("Recently")).click();
		driver.findElement(By.partialLinkText("COMPUTER")).click();

}

}
