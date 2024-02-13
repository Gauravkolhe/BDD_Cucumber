package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
    WebDriver driver;	
    


	@Given("browser  is on Open")
	public void browser_is_on_open() {
		
        WebDriver driver=null;		
		System.out.println("inside Step-browser is open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/sai/eclipse-workspace/Cucumber_Java_Project/src/test/resources/Drivers/chromedriver.exe");
	    
         driver=new ChromeDriver();		
		
	
	}
		
		
	

	@And("user is on google search page")
	public void user_is_on_google_search_page(WebDriver driver) {
		
		System.out.println("inside Step-user is on google search page");
		
		
		driver.navigate().to("https://www.google.com/");
		
}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box(Object driver) {
		
		System.out.println("inside Step-user enters a text in search box");
		
		
		
}
	   

	@When("hits enter")
	public void hits_enter() {
		
		System.out.println("inside Step-hits enter");
		
	
	   
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		System.out.println("user is navigated to search results");

	   
	}
	

}
