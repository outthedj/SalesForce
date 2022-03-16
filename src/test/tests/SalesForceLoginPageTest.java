package tests;

import models.SalesForceAccountModel;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class SalesForceLoginPageTest extends BaseTest{

        LoginPage loginPage;
        AccountPage accountPage;
        CreateAccountPage createAccountPage;

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
        SalesForceAccountModel salesForceAccountModel = GetNewAccountModel.getAccountWithAllFields();
        createAccountPage.saveNewAccountForm(salesForceAccountModel);
    }
}
