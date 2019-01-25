package co.com.ceiba.parkingchallenge;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) //Decirle Junit que corra los test con este motor de pruebas
@CucumberOptions( //opciones para la configuracion de cucumber
		features="src/test/resources/features/parking.feature", //ubicar los features
		glue = {"co.com.ceiba.parkingchallenge.stepsdefinition"}, //ubicar los steps definitions
		snippets = SnippetType.UNDERSCORE)
public class ParkingChallengeRunner { }
