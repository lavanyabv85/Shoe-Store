import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class showstore {
	WebDriver driver = new FirefoxDriver();
	By shoeStorePage=By.xpath("//h2[contains(text(),'Welcome to Shoe Store!')]");
	By txtEmailId=By.id("remind_email_input");
	By btnSubmit=By.id("remind_email_submit");
	By txtSuccessMsg=By.xpath("//div[@class='flash flash_success']");
	
	
	public void openshowstore() throws InterruptedException
	{
		
		driver.get("http://www.google.com");
		Thread.sleep(1000);
	}
	
	public void verifyShowSite()
	{
		String str1=driver.findElement(shoeStorePage).getText();
		
		if(str1.equalsIgnoreCase("Welcome to Shoe Store!"))
		{
			System.out.println("Show Store site is opened");
		}else
		
		{
			System.out.println("Show Store site is not opened");
		}
	
		
	}
	
	public void verifyEmailTest()
	{
		if(driver.findElement(By.id("remind_email_input")).isDisplayed())
		{
			System.out.println("Email text is displayed on Show store");
		}else
		{
			System.out.println("Email text is not displayed on Show store");
		}
	}
	
	public void enterEmailAddress() throws InterruptedException
	{
		driver.findElement(txtEmailId).sendKeys("lav@gnami.com");
		driver.findElement(btnSubmit).click();
		Thread.sleep(1000);
		if(driver.findElement(txtSuccessMsg).isDisplayed())
		{
			System.out.println("Thanks! We will notify you of our new shoes at this email: la@gmail.com: Message is displayed");
		}else
		{
			System.out.println("Thanks! We will notify you of our new shoes at this email: la@gmail.com: Message is not displayed");
		}
		
	}
	
	

}
