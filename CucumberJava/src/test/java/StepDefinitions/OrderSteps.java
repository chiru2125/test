package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pageobject;

public class OrderSteps {

	WebDriver driver=null;
	
	pageobject login;


	@Given("user open the url and login application")
	public void user_open_the_url() {
		
		login=new pageobject(driver);
		
		
		String projectpath=System.getProperty("user.dir");
		System.out.println("Proejct path is" + projectpath);

		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver_v87.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		login.enterUsername("chiru.burri@gmail.com");
		login.enterPassword("Test1234");
		login.clicklogin();
		

	}

	@When("User select T shirt and confirmed")
	public void user_select_tshirt() {
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/span/span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
	}

	@And("order submited sucessfully")
	public void order_submited_sucess() {
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.id("cgv")).click();

		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
	}

	@Then("validate the order")
	public void order_vlidation() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='center_column']/div")));
		System.out.println(element.getText());
	}


	@Given("user navigate to myaccount page")
	public void user_navigate_to_myaccount_page() {

		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")).click();

	}

	@When("Update Firstname")
	public void update_Firstname() {
		driver.findElement(By.id("firstname")).sendKeys("updatename");
		driver.findElement(By.id("old_passwd")).sendKeys("Test1234");
		driver.findElement(By.id("passwd")).sendKeys("Test12345");
		driver.findElement(By.id("confirmation")).sendKeys("Test12345");


	}

	@Then("save the details")
	public void save_the_details() {
		driver.findElement(By.xpath("//*[@id='center_column']/div/form/fieldset/div[11]/button/span")).click();

	}





}
