package primacalculo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import primapackage.PRIMAv3;

public class StepDefs {
	private int edad;
	private int puntos;
	private int prima;
	
	@Given("the age of customer is {int}")
	public void the_age_of_customer_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    edad = int1;
	}

	@Given("the licence points is {int}")
	public void the_licence_points_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    puntos = int1;
	}

	@When("the Seller calculate prima")
	public void the_Seller_calculate_prima() {
	    // Write code here that turns the phrase above into concrete actions
		PRIMAv3 p1 = new PRIMAv3(edad, puntos);		
		prima = p1.calcula_prima();		
	}

	@Then("the prima value is {int}")
	public void the_prima_value_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(int1.intValue(), prima);
	}
}