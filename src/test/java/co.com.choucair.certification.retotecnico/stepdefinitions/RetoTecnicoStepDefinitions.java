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
    public void angelaWantsToRegister(List<RegisterData> registerData) throws Exception {
        OnStage.theActorCalled("Angela").wasAbleTo(OpenUp.thePage(), (Register
                .onthePage(registerData.get(0).getStrfirstName(), registerData.get(0).getStrlastName(),
                registerData.get(0).getStremail(), registerData.get(0).getStrbirthMonth(), registerData.get(0).getStrbirthDay(),
                registerData.get(0).getStrbirthYear(), registerData.get(0).getStrcity(), registerData.get(0).getStrzip(), registerData.get(0).getStrcountryId(),
                registerData.get(0).getStrosId(), registerData.get(0).getStrosId(), registerData.get(0).getStrosVersionId(), registerData.get(0).getStrosLanguageId(),
                        registerData.get(0).getStrpassword(), registerData.get(0).getStrconfirmPassword())));
    }

    @When("^you have entered all the fields of the registration form$")
    public void youHaveEnteredAllTheFieldsOfTheRegistrationForm(List<RegisterData> registerData) throws  Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(registerData.get(0).getStrfirstName()));
    }

    @Then("^You can see all the information of the courses$")
    public void youCanSeeAllTheInformationOfTheCourses(List<RegisterData> registerData) throws  Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Registo.toThe(registerData.get(0).getStrfirstName())));

    }

}
