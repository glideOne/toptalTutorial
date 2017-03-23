package toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ovidiu.zakarias on 13.03.2017.
 */
public class DeveloperApplyPage {
    private WebDriver driver;

    @FindBy(tagName = "h1")
    WebElement heading;

    @FindBy(id = "talent_email")
    WebElement developer_email;

    @FindBy(id = "talent_password")
    WebElement developer_password;

    @FindBy(id = "talent_password_confirmation")
    WebElement developer_password_confirmation;

    @FindBy(id = "talent_full_name")
    WebElement developer_full_name;

    @FindBy(id = "talent_skype")
    WebElement developer_skype;

    @FindBy(id = "save_new_talent")
    WebElement join_toptal_button;

    //Constructor
    public DeveloperApplyPage(WebDriver driver) {
        this.driver = driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void setDeveloper_email(String email) {
        developer_email.clear();
        developer_email.sendKeys(email);
    }

    public void setDeveloper_password(String password) {
        developer_password.clear();
        developer_password.sendKeys(password);
    }

    public void setDeveloper_password_confirmation(String password_confirmation) {
        developer_password_confirmation.clear();
        developer_password_confirmation.sendKeys(password_confirmation);
    }

    public void setDeveloper_full_name(String fullname) {
        developer_full_name.clear();
        developer_full_name.sendKeys(fullname);
    }

    public void setDeveloper_skype(String skype) {
        developer_skype.clear();
        developer_skype.sendKeys(skype);
    }

    public void clickOnJoin() {
        join_toptal_button.click();
    }

    public boolean isPageOpened() {
        //Assertion
        return heading.getText().toString().contains("Apply to Join our Network");
    }
}
