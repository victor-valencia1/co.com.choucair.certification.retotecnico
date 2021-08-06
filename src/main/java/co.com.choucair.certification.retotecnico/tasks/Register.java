package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    private String StrfirstName;
    private String StrlastName;
    private String Stremail;
    private String StrbirthMonth;
    private String StrbirthDay;
    private String StrbirthYear;
    private String Strcity;
    private String Strzip;
    private String StrcountryId;
    private String StrosId;
    private String StrosVersionId;
    private String StrosLanguageId;
    private String Strpassword;
    private String StrconfirmPassword;

    public Register(String StrfirstName, String StrlastName, String Stremail, String StrbirthMonth,String StrbirthDay,
                    String StrbirthYear,String Strcity,String Strzip, String StrcountryId, String StrosId, String StrosVersionId,
                    String StrosLanguageId,String Strpassword, String StrconfirmPassword ) {
        this.StrfirstName = StrfirstName;
        this.StrlastName = StrlastName;
        this.Stremail = Stremail;
        this.StrbirthMonth = StrbirthMonth;
        this.StrbirthDay = StrbirthDay;
        this.StrbirthYear = StrbirthYear;
        this.Strcity = Strcity;
        this.Strzip = Strzip;
        this.StrcountryId = StrcountryId;
        this.StrosId = StrosId;
        this.StrosVersionId = StrosVersionId;
        this.StrosLanguageId = StrosLanguageId;
        this.Strpassword = Strpassword;
        this.StrconfirmPassword = StrconfirmPassword;







    }


    public static Performable onthePage(String strfirstName1, String name, String s, String month, String strbirthDay, String strbirthYear, String strcity, String strzip, String strcountryId, String strfirstName, String strlastName, String stremail, String strbirthMonth, String strUser, String strPassword) {
        return Tasks.instrumented(Register.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.JOIN_TODAY_BUTTON),
                Enter.theValue("firstName").into(RegisterPage.INPUT_FIRTSNAME),
                Enter.theValue("lastName").into(RegisterPage.INPUT_LASTNAME),
                Enter.theValue("email").into(RegisterPage.INPUT_EMAIL),
                Enter.theValue("birthMounth").into(RegisterPage.INPUT_BIRTHMOUNTH),
                Enter.theValue("birthDay").into(RegisterPage.INPUT_BIRTHDAY),
                Enter.theValue("birtYear").into(RegisterPage.INPUT_BIRTHYEAR),
                Enter.theValue("search").into(RegisterPage.INPUT_SEARCH),
                Click.on(RegisterPage.ENTER_BUTTON),
                Enter.theValue("city").into(RegisterPage.INPUT_CITY),
                Enter.theValue("zip").into(RegisterPage.INPUT_ZIP),
                Enter.theValue("countryId").into(RegisterPage.INPUT_COUNTRY),
                Click.on(RegisterPage.ENTER_BUTTON2),
                Enter.theValue("osId").into(RegisterPage.INPUT_YOU_COMPUTER),
                Enter.theValue("osVersionId").into(RegisterPage.INPUT_VERSION),
                Enter.theValue("osLanguageId").into(RegisterPage.INPUT_LENGUAGES),
                Enter.theValue("handsetMakerId").into(RegisterPage.INPUT_YOU_MOBILE_DEVICES),
                Enter.theValue("handsetModelId").into(RegisterPage.INPUT_MODEL),
                Enter.theValue("handsetOSId").into(RegisterPage.INPUT_OPERATING_SYSTEM),
                Click.on(RegisterPage.INPUT_BUTTON3),
                Enter.theValue("password").into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue("confirmPassword").into(RegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterPage.INPUT_BUTTON3)

        );
    }
}