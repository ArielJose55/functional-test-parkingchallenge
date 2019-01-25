package co.com.ceiba.parkingchallenge.stepsdefinition;

import org.openqa.selenium.WebDriver;

import co.com.ceiba.parkingchallenge.steps.TesterActor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class ParkingStepsDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver browser;
	
	@Steps
	private Actor elVigilante = Actor.named("ElVigilante");
	
	@Steps
	private TesterActor actor;
	
	
	@Given("that I opened the browser on the vehicle registration page")
	public void that_I_opened_the_browser_on_the_vehicle_registration_page()  {
		actor.opensBrowserInTheHomePageParking();
	}
	
	@When("I am going to the registration of vehicles section")
	public void i_am_going_to_the_registration_of_vehicles_section() {
		actor.enterAtSeccionRegisterVehicle();
	}
	
	@Then("I check if the plate the vehicle exists")
	public void i_check_if_the_plate_the_vehicle_exists() {
		actor.enterThePlateAndVerifyIfItExists("XXX");
	}
	
	@Given("that I opened the browser on the vehicle list page")
	public void that_I_opened_the_browser_on_the_vehicle_list_page()  {
		actor.opensBrowserInTheHomePageParking();
	}
	
	@When("I get the list of active vehicles")
	public void i_get_the_list_of_active_vehicles() {
		
	}
}
