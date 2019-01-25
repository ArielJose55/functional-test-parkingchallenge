package co.com.ceiba.parkingchallenge.steps;

import co.com.ceiba.parkingchallenge.ui.HomePageParking;
import co.com.ceiba.parkingchallenge.ui.VehicleListPage;
import co.com.ceiba.parkingchallenge.ui.VehicleRegistrationPage;
import net.thucydides.core.annotations.Step;

public class TesterActor {

	private HomePageParking homePageParking;

	private VehicleRegistrationPage registrationPage;

	private VehicleListPage vehicleListPage;

	@Step(value = "Open la home page parking")
	public void opensBrowserInTheHomePageParking() {
		try {
			homePageParking.open();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Step
	public void enterAtSeccionRegisterVehicle() {
		try {
			registrationPage.enterTheVehicleRegistrationSection();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Step
	public void enterThePlateAndVerifyIfItExists(String plate) {
		try {
			registrationPage.interThePlateToSearch(plate);
			registrationPage.searchByPlate();
			registrationPage.enterTheModel("R1");
			registrationPage.enterTheBrand("Yamaha");
			registrationPage.enterTheValue("1000");
			registrationPage.submit();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Step
	public void enterAtSeccionListVehicle() {
		try {
			vehicleListPage.enterTheVehicleListSection();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Step
	public void registersTheVehicle() {
		try {
			
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
