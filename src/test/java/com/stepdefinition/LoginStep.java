package com.stepdefinition;

import java.sql.Driver;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {

//	WebDriver driver;
//	@Given("user is on the adactin page")
//	public void user_is_on_the_adactin_page() {
//		 WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();
//		  driver.get("http://adactinhotelapp.com/");
//		  driver.manage().window().maximize();
//	}
//
//	
//	@When("user should enter username and password")
//	public void user_should_enter_username_and_password() {
//		WebElement txtUserName = driver.findElement(By.id("username"));
//		txtUserName.sendKeys("Rubashree");
//		WebElement txtPassword = driver.findElement(By.id("password"));
//		txtPassword.sendKeys("Ruba123456789");
//		}
//
//	
//	@When("user should click login button")
//	public void user_should_click_login_button() {
//	   WebElement btnLogin = driver.findElement(By.id("login"));
//	   btnLogin.click();
//	}
//	@Then("user should verify after login success message")
//	public void user_should_verify_after_login_success_message() {
//	   Assert.assertTrue("Verify after login", true);
//	   driver.quit();
//	}
//

	WebDriver driver;

	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("http://adactinhotelapp.com/");
		  driver.manage().window().maximize();
	}
	
	
	@When("User should perform login {string} and {string}")
	public void user_should_perform_login_and(String name, String pass) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(pass);
	}
	
	
	@When("User should click login button")
	public void user_should_click_login_button() {
		 WebElement btnLogin = driver.findElement(By.id("login"));
		 btnLogin.click();
	}
	
	
	@When("User should search a hotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_search_a_hotel_and(String location, String hotels, String roomtype, String numberOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
	  WebElement selectLocation = driver.findElement(By.id("location"));
	  Select select = new Select(selectLocation);
	  select.selectByVisibleText(location);
	  
	  WebElement selectHotel = driver.findElement(By.id("hotels"));
	  Select select1 = new Select(selectHotel);
	  select1.selectByVisibleText(hotels);
	  
	  WebElement selectRoomType = driver.findElement(By.id("room_type"));
	  Select select2 = new Select(selectRoomType);
	  select2.selectByVisibleText(roomtype);
	  
	  WebElement selectRoomNUm = driver.findElement(By.id("room_nos"));
	  Select select3 = new Select(selectRoomNUm);
	  select3.selectByVisibleText(numberOfRooms);
	  
	  WebElement pickIn = driver.findElement(By.id("datepick_in"));
	  
	  pickIn.sendKeys(checkInDate);
	 	  
	  WebElement pickOut = driver.findElement(By.id("datepick_out"));
	  pickOut.sendKeys(checkOutDate);
	  
	  WebElement adultRoom = driver.findElement(By.id("adult_room"));
	  Select select4 = new Select(adultRoom);
	  select4.selectByVisibleText(adultsPerRoom);
	  
	  WebElement childRoom = driver.findElement(By.id("child_room"));
	  Select select5 = new Select(childRoom);
	  select5.selectByVisibleText(childrenPerRoom);
	  
	  driver.findElement(By.id("Submit")).click();;
	  
	  
	}
	
	
	@When("User should select hotel")
	public void user_should_select_hotel() {
	
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}
	
	
	@When("User should book a hotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_book_a_hotel_and(String firstName, String lastName, String billingAddress, String creditCardNumber, String creditCardType, String expiryDateMonth, String expiryDateYear, String cvvNumber) {
	
		WebElement firstName1 = driver.findElement(By.id("first_name"));
		firstName1.sendKeys(firstName);
		
		WebElement lastName1 = driver.findElement(By.id("last_name"));
		lastName1.sendKeys(lastName);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(billingAddress);
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(creditCardNumber);
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(ccType);
		select6.selectByVisibleText(creditCardType);
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(expMonth);
		select7.selectByVisibleText(expiryDateMonth);
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(expYear);
		select8.selectByVisibleText(expiryDateYear);
		
		WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys(cvvNumber);
		driver.findElement(By.id("book_now")).click();
	}
	
	
	@When("User should print the order number")
	public void user_should_print_the_order_number() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("order_no")));
	   WebElement orderId = driver.findElement(By.id("order_no"));
	   System.out.println(orderId.getAttribute("value"));
	}



	}




