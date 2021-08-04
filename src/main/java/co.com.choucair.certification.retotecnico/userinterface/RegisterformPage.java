package co.com.choucair.certification.retotecnico.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterformPage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to join today")
            .located(By.xpath("//[div@class='d-none-d-lg-block']//strong[contains(text(),'JOINT TODAY)]"));
    public static final Target INPUT_FIRTSNAME = Target.the("where do we write the firts name")
            .located(By.id("firtsName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_BIRTHMOUNTH = Target.the("where do we write the birMounth")
            .located(By.id("birtMounth"));
    public static final Target INPUT_BIRTHDAY = Target.the("where do we write the birthDay")
            .located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR = Target.the("where do we write the birthYear")
            .located(By.id("birthYear"));
    public static final Target INPUT_SEARCH = Target.the("where do we write the Languages (spoken): (English is default) ")
            .located(By.id("search"));
    public static final Target ENTER_BUTTON = Target.the("Next: Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final  Target INPUT_ZIP = Target.the("where do we write the zip o postal code")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where do we select your country")
            .located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected']//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target ENTER_BUTTON2 = Target.the("where do we write the Next: Location")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_YOU_COMPUTER =Target.the("where do we select Your Computer Autodetected")
            .located(By.cssSelector("#web-device > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)"));
    public static final Target INPUT_VERSION = Target.the("where do we select you version")
            .located(By.cssSelector("#web-device > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)"));
    public static final Target INPUT_LENGUAGES = Target.the("where we do select you lenguage")
            .located(By.cssSelector("#web-device > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)"));
    public static final Target INPUT_YOU_MOBILE_DEVICES = Target.the("where do we select you mobil device")
            .located(By.cssSelector("main.registration section.col-md-8.col-lg-8.col-sm-12.col-xs-12:nth-child(3) div.container-fluid div.sign-up-form-container div.ui-view div.form-group-box:nth-child(1) div.devices-box div.row.second:nth-child(2) div.form-group.col-xs-12.col-sm-4.col-md-4.col-lg-4.select2-theme-form:nth-child(1) div.ui-select-box:nth-child(2) div.ui-select-container.ui-select-bootstrap.dropdown.ng-empty.ng-valid div.ui-select-match:nth-child(1) > span.btn.btn-default.form-control.ui-select-toggle"));
    public static final Target INPUT_MODEL = Target.the("were do we select you model")
            .located(By.xpath("//div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where do we select you operating system")
            .located(By.xpath("//div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_BUTTON3 = Target.the("Next: Last Step ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm Password")
            .located(By.id("confirmPassword"));


    // I have read and accept the
    public class Checkbox {

        private final WebElement checkboxField;

        public Checkbox(final WebElement checkboxField) {
            this.checkboxField = checkboxField;
        }

        public void setChecked(final boolean value) {
            if (checkboxField.isSelected()) {
                clickToUnselect(value);
            } else {
                clickToSelect(value);
            }
        }

        private void clickToSelect(final boolean value) {
            if (value) {
                checkboxField.click();
            }
        }

        private void clickToUnselect(final boolean value) {
            if (!value) {
                checkboxField.click();
            }
        }

        public boolean isChecked() {
            return checkboxField.isSelected();
        }

    }

    //I have read and accept the
    public class Checkbox2 {

        private final WebElement checkboxField;

        public Checkbox2(final WebElement checkboxField) {
            this.checkboxField = checkboxField;
        }

        public void setChecked(final boolean value) {
            if (checkboxField.isSelected()) {
                clickToUnselect(value);
            } else {
                clickToSelect(value);
            }
        }

        private void clickToSelect(final boolean value) {
            if (value) {
                checkboxField.click();
            }
        }

        private void clickToUnselect(final boolean value) {
            if (!value) {
                checkboxField.click();
            }
        }

        public boolean isChecked() {
            return checkboxField.isSelected();
        }

    }

    public static final Target Enter_BUTTON4 = Target.the("button to confirm Complete Setup")
            .located(By.id("laddaBtn"));

}

