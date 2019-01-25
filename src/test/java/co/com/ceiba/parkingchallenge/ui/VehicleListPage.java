package co.com.ceiba.parkingchallenge.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VehicleListPage extends PageObject {

	@FindBy(xpath = "//a[text()='Ver Vehiculos']")
    private WebElementFacade buttonListVehicle;
	
	
	public void enterTheVehicleListSection() {
    	buttonListVehicle.click();
    }
}
