package tests;

import models.SalesForceAccountModel;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.CreateAccountPage;
import pages.LoginPage;
import testdata.GetNewAccountModel;

public class SalesForceAccountTest extends BaseTest {

    public static final String EMAIL = "outthedj-d8sg@force.com";
    public static final String PASSWORD = "2807389out";

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        SalesForceAccountModel salesForceAccountModel = GetNewAccountModel.getAccountWithAllFields();
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        System.out.println("");
    }
}