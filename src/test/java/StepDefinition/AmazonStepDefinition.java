package StepDefinition;

import java.util.List;

import io.cucumber.java.en.*;

public class AmazonStepDefinition {

	@Given("Navigate to Amazon Home Page")
	public void navigate_to_amazon_home_page() {
	    System.out.println("Navigated");
	}

	@When("Search for product {string}")
	public void search_for_product(String string) {
	   System.out.println(string);
	}

	@When("Open the Prefered Product")
	public void open_the_prefered_product() {
	   System.out.println("Selected");
	}

	@Then("Click Add to cart button")
	public void click_add_to_cart_button() {
	    System.out.println("Added to cart");
	}
	
	@When("Search for product")
	public void search_for_product(io.cucumber.datatable.DataTable dataTable) {
	   for(String testData: dataTable.asList()) {
		   System.out.println("Product   "+testData);
	   }
	}
}
