package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AccountPage extends BasePage{

    private By NEW_BUTTON = By.xpath("//div[text()='New']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void openAccountsTab(){
        driver.get(WebUrls.SALESFORCE_ACCOUNT_URL);
    }

    public void openCreateAccountPage(){
        driver.findElement(NEW_BUTTON).click();
    }
}
