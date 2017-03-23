package toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ovidiu.zakarias on 13.03.2017.
 */
// https://www.toptal.com/developers/join
public class DeveloperPortalPage {

    private WebDriver driver;

    //@FindBy(xpath = "id('top')/x:div[1]/x:div/x:div/x:header/x:div/x:h1")
    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(linkText = "JOIN TOPTAL")
    private WebElement joinToptalButton;

    //Constructor
    public DeveloperPortalPage (WebDriver driver) {
        this.driver = driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //We will use this boolean for assertion. To check if page is opened
    public boolean isPageOpened() {
        return header.getText().contains("Developer Portal");
    }

    public void clickOnJoin() {
        joinToptalButton.click();
    }

}
