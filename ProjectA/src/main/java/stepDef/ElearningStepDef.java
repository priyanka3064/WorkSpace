package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ElearningStepDef {
	WebDriver driver;
	@Given("navigate to Elearing page {string}")
	public void navigate_to_elearing_page(String Url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am in nevigation method : "+Url);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002DO1744\\Documents\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
	   
	}

	@When("Click on Sign Up link {string},{string},{string},{string},{string},{string},{string},{string}")
	public void click_on_sign_up_link(String FirstName, String LastName,String email,String userName,String pass,String cPass,String phoneNo,String Language ) {
		
		driver.findElement(By.xpath("//a[contains(text(),\"Sign\")]")).click();
		
		System.out.println("click_on_sign_up_link"+FirstName+LastName);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(cPass);
		driver.findElement(By.xpath("//input[@id='registration_phone']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
	}



	@SuppressWarnings("deprecation")
	@Then("Verify user is able to login successfully")
	public void verify_user_is_able_to_login_successfully() {
		String verifyText=driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']/p")).getText();
		System.out.println("I am in Then menthod" + verifyText);
		//wanted to verify first name 
		Assert.assertTrue("Dear manzoor mehadi", verifyText.contains("manzoor"));
		driver.close();
	   
	 
	}
	
	
	@When("Enter username and passowrd  {string},{string}")
	public void enter_username_and_passowrd(String userName, String password) {
	   driver.findElement(By.xpath("//input[@id='login']")).sendKeys(userName);
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	   driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
	   System.out.println(driver.getTitle());
	}

	@Then("verify login successfully")
	public void verify_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		String testV=driver.findElement(By.xpath("//div[@class='normal-message']/p[1]")).getText();
		System.out.println(testV);
		Assert.assertEquals("Hello manzoor mehadi and welcome,", testV);
		
	    
	}
	
	
	@And("click on profile edit")
	public void click_on_profile_edit() {
//	    Assert.assertEquals("My Organization - My education - My courses", driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Edit p')]")).click();
		
	}

	@And("Enter valid password {string},{string},{string}")
	public void enter_valid_password(String presentPwd, String currentPwd, String currentPwdA) {
		driver.findElement(By.xpath("//input[@id='profile_password0']")).sendKeys(presentPwd);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(currentPwd);
		driver.findElement(By.xpath("//input[@id='profile_password2']")).sendKeys(currentPwdA);
		driver.findElement(By.xpath("//button[@id='profile_apply_change']")).click();
	}

	@Then("password had changes successfully")
	public void password_had_changes_successfully() {
	   
		String vEdit=driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals("Your new profile has been saved,", vEdit);
		driver.quit();
	}


}
