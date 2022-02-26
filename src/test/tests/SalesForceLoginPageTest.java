package tests;

import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

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
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        System.out.println("");
    }
}
