package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class LoginPage extends BasePage{

    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openSalesForcePage(){
        driver.get(WebUrls.SALESFORCE_LOGIN_URL);
    }

    public void inputUsername() {
        driver.findElement(USERNAME_INPUT).sendKeys("outthedj-d8sg@force.com");
    }

    public void inputPassword(){
        driver.findElement(PASSWORD_INPUT).sendKeys("2807389out");
    }

    public void loginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }
}
