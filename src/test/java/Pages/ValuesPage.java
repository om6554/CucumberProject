package Pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValuesPage {

	static WebDriver driver;
	int elementCount = 0;
	static ArrayList<String> intialList = new ArrayList<String>();
	static ArrayList<Double> finalList = new ArrayList<Double>();
	static By txt_value = By.xpath("//*[contains(@id,'txt_val_')]");
	static By txt_value1 = By.id("txt_val_1");
	static By txt_value2 = By.id("txt_val_2");
	static By txt_value3 = By.id("txt_val_4");
	static By txt_value4 = By.id("txt_val_5");
	static By txt_value5 = By.id("txt_val_6");
	static By txt_ttl_value = By.id("txt_ttl_val");
	By lbl_value1 = By.id("lbl_val_1");
	By lbl_value2 = By.id("lbl_val_2");
	By lbl_value3 = By.id("lbl_val_3");
	By lbl_value4 = By.id("lbl_val_4");
	By lbl_value5 = By.id("lbl_val_5");
	By lbl_ttl_value = By.id("lbl_ttl_val");

	public ValuesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyElementPresentCount(Integer int1) {

		try {
			elementCount = driver.findElements(txt_value).size();
			System.out.println(elementCount);
			Assert.assertTrue(elementCount == int1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void getValuesfromFields() {

		try {
			
			intialList.add(driver.findElement(txt_value1).getText());
			intialList.add(driver.findElement(txt_value2).getText());
			intialList.add(driver.findElement(txt_value3).getText());
			intialList.add(driver.findElement(txt_value4).getText());
			intialList.add(driver.findElement(txt_value5).getText());
			intialList.add(driver.findElement(txt_ttl_value).getText());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("getValuesFromFields");			
			e.printStackTrace();
		}

	}

	public static void GetValuesFromList() {
		try {
			
			for (int i = 0; i < intialList.size(); i++) {
				finalList.add(Double.parseDouble(intialList.get(i).replace("$", "")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("GetValuesFromList");
			e.printStackTrace();
		}

	}

	public void CheckValues(Integer int2) {
		try {
			this.getValuesfromFields();
			this.GetValuesFromList();
			for (int i = 0; i <= finalList.size(); i++) {
				Assert.assertTrue(finalList.get(i) > int2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void CheckTotal() {
		try {
			this.getValuesfromFields();
			this.GetValuesFromList();
			double ActualTotal = 0;
			for (int i = 0; i < finalList.size() - 1; i++) {
				ActualTotal = ActualTotal + finalList.get(i);
			}
			int ExpectedTotal = Integer.parseInt(driver.findElement(txt_ttl_value).getText());
			Assert.assertTrue(ActualTotal == ExpectedTotal);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void CheckCurrencySymbol() {
		try {
			this.getValuesfromFields();
			for (int i = 0; i < intialList.size(); i++) {
				Assert.assertTrue(intialList.get(i).contains("$"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
