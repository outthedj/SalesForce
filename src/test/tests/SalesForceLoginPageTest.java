package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;

public class SalesForceLoginPageTest extends BaseTest{

        LoginPage loginPage;

    @Test
    public void firstCheckboxTest() {
        loginPage = new LoginPage(driver);
        loginPage.openSalesForcePage();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.loginButton();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.openAccountsTab();
        accountPage.openCreateAccountPage();
        System.out.println("");
    }
}
