package salesForces;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


/*TestCase:2-Opportunities
//setup the path//disable notifications//manage ur window//add wait
// Login to https://login.salesforce.com
//enter username//enter password//click login button
//Click on toggle menu button from the left corner
//Click view All and click Sales from App Launcher//Click on Opportunity tab //Click on New button
//Enter the Oppertunity name//Enter 'your name' as account name//choose close date
//click stage(Needs Analysis)//click save//verify message// Close the Browser
driver.close();
*/

 public class Opportunities {


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
    	driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");
    	driver.findElement(By.className("forceActionLink")).click();//new tab
    	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Sarvika");//opp name
    	//driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));//drop
    	//dropdown.selectByIndex(3);
    	
        
    	driver.findElement(By.className("slds-button slds-button_icon slds-button_icon-bare")).click();//Calendar
    	
    	driver.findElement(By.className("slds-button slds-button_brand")).click();
	}

}
