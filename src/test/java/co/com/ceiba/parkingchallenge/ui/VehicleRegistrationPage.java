package co.com.ceiba.parkingchallenge.ui;

import static org.assertj.core.api.Assertions.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class VehicleRegistrationPage extends PageObject {
	
	@FindBy(xpath = "//a[text()='Registrar Entrada']")
    private WebElementFacade buttonRegisterVehicle;
	
	@FindBy(id = "plate" )
	private WebElementFacade inputFieldPlate;
	
	@FindBy(id = "search" )
	private WebElementFacade buttonSearchPlate;
	
	@FindBy(id ="model" )
	private WebElementFacade inputFieldModel;
	
	@FindBy(xpath ="//input[@name='brand']" )
	private WebElementFacade inputFieldBrand;
	
	@FindBy(xpath ="//input[@name='value']")
	private WebElementFacade inputFieldValue;
	
	@FindBy(xpath ="//button[text()='Carro']" )
	private WebElementFacade buttonTypeVehicle;
	
	@FindBy(xpath ="//button[@type='submit' and text()='Registrar']")
	private WebElementFacade buttonRegister;
    
	@FindBy(id ="labelInforVerify" )
	private WebElementFacade labelValidate;
	
	
    public void enterTheVehicleRegistrationSection() {
    	buttonRegisterVehicle.click();
    }
    
    public void interThePlateToSearch(String plate) {
    	inputFieldPlate.sendKeys(plate);
    }
    
    public void searchByPlate() {
    	buttonSearchPlate.click();
    	String labelInfo = labelValidate.getText();
    	assertThat(labelInfo)
    		.isEqualTo("Vehiculo no registrado aun, rellene los campos de abajo")
    			.as("El vehiculo no esta registrado");
    }
    
    public void enterTheModel(String model) {
    	inputFieldModel.sendKeys(model);
    }
    
    public void enterTheBrand(String brand) {
    	inputFieldBrand.sendKeys(brand);
    }
    
    public void enterTheValue(String value) {
    	inputFieldValue.sendKeys(value);
    }
    
    public void submit() {
    	buttonRegister.click();
    }
}
