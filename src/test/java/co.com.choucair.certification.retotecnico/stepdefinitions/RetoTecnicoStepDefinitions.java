package co.com.choucair.certification.retotecnico.stepdefinitions;


import co.com.choucair.certification.retotecnico.model.RegisterData;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.Register;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Angela wants to register$")
    public void angelaWantsToRegister(List<RegisterData> RegisterData) throws Exception {
        OnStage.theActorCalled("Angela").wasAbleTo(OpenUp.thePage(), (Register
                .onthePage(RegisterData.get(0).getStrfirstName(), RegisterData.get(0).getStrlastName(),
                        RegisterData.get(0).getStremail(), RegisterData.get(0).getStrbirthMonth(), RegisterData.get(0).getStrbirthDay(),
                        RegisterData.get(0).getStrbirthYear(), RegisterData.get(0).getStrcity(), RegisterData.get(0).getStrzip(), RegisterData.get(0).getStrcountryId(),
                        RegisterData.get(0).getStrosId(), RegisterData.get(0).getStrosVersionId(), RegisterData.get(0).getStrosLanguageId(), RegisterData.get(0).getStrpassword(),
                        RegisterData.get(0).getStrconfirmPassword())));
    }

    @When("^you have entered all the fields of the registration form$")
    public void youHaveEnteredAllTheFieldsOfTheRegistrationForm() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^You can see all the information of the courses$")
    public void youCanSeeAllTheInformationOfTheCourses() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();


    }

}
