package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ValuesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ValidateFields {
	
	WebDriver driver=null;
	ValuesPage fields;
	
	@Given("user lanches browser")
	public void user_lanches_browser() {
		String projectDir=System.getProperty("user.dir");
		System.out.println("project directory is :"+projectDir);
		System.setProperty("webdriver.chrome.driver",projectDir+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);				
	}

	@Then("maximizes the brower")
	public void maximizes_the_brower() {
	    
		driver.manage().window().maximize();
	    
	}

	@And("Navigate to values page")
	public void navigate_to_values_page() {
	    driver.get("https://www.exercise1.com/values ");	
	}
	
	@And("get the value of from each textfield")
	public void get_the_text_of_from_each_textfield() {
		fields= new ValuesPage(driver);
		fields.getValuesfromFields();
	}

	@Then("verify count of values matches with {int}")
	public void verify_count_of_values_matches_with(Integer int1) {
		fields= new ValuesPage(driver);
		fields.getValuesfromFields();
		fields.GetValuesFromList();
		fields.verifyElementPresentCount(int1);
	}	

	@Then("verify all the values grater than {int}")
	public void verify_all_the_values_grater_than(Integer int2) {
		fields= new ValuesPage(driver);
		fields.getValuesfromFields();
		fields.GetValuesFromList();
		fields.CheckValues(int2);
	}

	@Then("perform a sum of all values")
	public void perform_a_sum_of_all_values() {
		fields= new ValuesPage(driver);
		fields.getValuesfromFields();
		fields.GetValuesFromList();
		fields.CheckTotal();
	}

	@Then("Verify $ is present the extracted text")
	public void verify_$_is_present_the_extracted_text() {
		fields= new ValuesPage(driver);
		fields.getValuesfromFields();
		fields.CheckCurrencySymbol();
	}
	
}
