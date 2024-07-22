package com.maveric.project.project.stepdtefs;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class TestStepdef 
{
	
private static WebDriver driver;
 
    @Before
    public void setUpEnv() 
    {
	driver= Factory.getdriver();
	driver.get("https://www.google.co.in/");
      }
 
         @Given("User should open Google search page")
       public void user_should_open_google_search_page() {
   
       }
 
       @When("User enterd {string} in search box")
       public void user_enterd_in_search_box(String string)
       {
	   WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys(string);
       }
 
         @When("click on submit button")
         public void click_on_submit_button() 
         {
	 WebElement submitbtn= driver.findElement(By.name("btnK"));
	 submitbtn.click();
         }
 
         @Then("Multiple Links should be displayed on {string} topic")
         public void multiple_links_should_be_displayed_on_topic(String string) 
         {
    System.out.println("Done searching");
         }
 
         //@When("User enterd cities name {string}  in search box")
         //public void user_enterd_cities_name_in_search_box(String string) {
         //    
         //}
         //
         //@Then("map should be display between {string} cities along with distance in KM")
         //public void map_should_be_display_between_cities_along_with_distance_in_km(String string) {
         //}
 
         @After
         public void teardown() 
         {
         	//driver.quit();
         }
 
 
         }