package sel.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Good_Read {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajith\\eclipse-workspace\\Sel_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(1000);
		
		
	    driver.get("https://www.goodreads.com/"); Thread.sleep(2000);
	    WebElement l = driver.findElement(By.xpath("//a[text()='Sign In']"));
		l.click();
		WebElement login = driver.findElement(By.xpath("//button[@class='gr-button gr-button--dark gr-button--auth authPortalConnectButton authPortalSignInButton']"));
		login.click();
		WebElement email = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		email.sendKeys("keerthanaa436@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Keerthu123$");
		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search books']"));
		search.sendKeys("Harry Potter and the Philosopher’s Stone");
		WebElement s = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		s.click();
		WebElement clickproduct= driver.findElement(By.xpath("//button[@class=\"wtrToRead\"]"));
		clickproduct.click();
		Thread.sleep(3000);
		
		WebElement booktitle= driver.findElement(By.xpath("//a[@class=\"bookTitle\"]"));
		booktitle.click(); 
		WebElement selectpopup = driver.findElement(By.xpath("//button[@class=\"Button Button--secondary Button--medium Button--block\"]"));
	    selectpopup.click();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement gotoremove = driver.findElement(By.xpath("//button[@class=\"Button Button--inline Button--medium Button--block\"]"));
		gotoremove.click(); 
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement remove = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/button"));
	    remove.click();		
	
      	WebElement info= driver.findElement(By.xpath("//*[@id=\"Header\"]/div[2]/nav/ul/li[5]/div/button"));
		info.click();
		WebElement signout= driver.findElement(By.xpath("//a[@href=\"/user/sign_out?ref=nav_profile_signout\"]"));
		signout.click();
		

		
}
}
