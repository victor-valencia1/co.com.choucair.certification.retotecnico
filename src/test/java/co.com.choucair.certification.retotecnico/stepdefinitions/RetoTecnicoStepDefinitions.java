package co.com.choucair.certification.retotecnico.stepdefinitions;


import co.com.choucair.certification.retotecnico.model.RegisterData;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
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
                        RegisterData.get(0).getStremail(),RegisterData.get(0).getStrbirthMonth(),RegisterData.get(0).getStrbirthDay(),
                        RegisterData.get(0).getStrbirthYear(),RegisterData.get(0).getStrcity(),RegisterData.get(0).getStrzip(),RegisterData.get(0).getStrcountryId(),
                        RegisterData.get(0).getStrosId(),RegisterData.get(0).getStrosId(),RegisterData.get(0).getStrosVersionId(),RegisterData.get(0).getStrosLanguageId(),
                        RegisterData.get(0).getStrpassword(),RegisterData.get(0).getStrconfirmPassword())));
    }


}


