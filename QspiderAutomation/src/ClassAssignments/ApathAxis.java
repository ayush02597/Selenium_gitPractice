package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApathAxis {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	String SamsungDiscount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
	System.out.println(SamsungDiscount);
	}

}
