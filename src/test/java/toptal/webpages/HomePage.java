package toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ovidiu.zakarias on 13.03.2017.
 */
public class HomePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "https://www.toptal.com/developers";

    //Locators

    //Apply as Freelance Button
    @FindBy(how = How.LINK_TEXT, using = "APPLY AS A DEVELOPER")
    //@FindBy(tagName = "a")
    //@FindBy(xpath = "id('top')/x:div[1]/x:header/x:div[2]/x:div/x:div/x:nav/x:ul/x:li[2]/x:a")
    private WebElement developerApplyButton;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnDeveloperApplyButton() {
        developerApplyButton.click();
    }

}
