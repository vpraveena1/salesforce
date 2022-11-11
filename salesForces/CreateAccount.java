package salesForces;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class CreateAccount {
	 public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			
			ChromeOptions ch=new ChromeOptions();
			ChromeDriver driver=new ChromeDriver(ch);
			driver.get("https://login.salesforce.com");
			ch.addArguments("--disable-notifications");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Testleaf$321");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.className("slds-icon-waffle")).click();
	    	driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
			driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent"); 
	    	driver.findElement(By.className("forceActionLink")).click();
	    	driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("PRAVEENA");
	    	driver.findElement(By.xpath("(//span[@class='slds-truncate'])[30]")).click();
	    	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    	
	    	}
 }