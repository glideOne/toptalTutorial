package toptal.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.SystemClock;
import toptal.webpages.DeveloperApplyPage;
import toptal.webpages.DeveloperPortalPage;
import toptal.webpages.HomePage;

import java.util.concurrent.TimeUnit;


/**
 * Created by ovidiu.zakarias on 13.03.2017.
 */
public class ApplyAsDeveloperTest {
    WebDriver driver;

    @Before
    public void setup() {
        //use Chrome Driver
        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "/src/main/resources/chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        HomePage homepage = new HomePage(driver);
        homepage.clickOnDeveloperApplyButton();

        //Create object of DeveloperPortalPage
        DeveloperPortalPage developerPortalPage = new DeveloperPortalPage(driver);

        //Check if page is opened
        Assert.assertTrue(developerPortalPage.isPageOpened());

        //Click on Join Toptal
        developerPortalPage.clickOnJoin();

        //Create object of DeveloperApplyPage
        DeveloperApplyPage developerApplyPage = new DeveloperApplyPage(driver);

        //Check if page is opened
        Assert.assertTrue(developerApplyPage.isPageOpened());

        //Fill up form
        developerApplyPage.setDeveloper_email("ovidiu.zakarias@pitechnologies.ro");
        developerApplyPage.setDeveloper_full_name("Ovidiu Zakarias");
        developerApplyPage.setDeveloper_password("quality1");
        developerApplyPage.setDeveloper_password_confirmation("quality1");
        developerApplyPage.setDeveloper_skype("ovidiu.zakarias");

        //Click on join
        developerApplyPage.clickOnJoin();
    }

    @After
    public void close() { driver.close(); }

}
