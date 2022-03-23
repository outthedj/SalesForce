package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.GetNewAccountModel;

public class SuccessfulCreateAccountTest extends BaseTest {

    public static final String EMAIL = "outthedj-d8sg@force.com";
    public static final String PASSWORD = "2807389out";

    @Test()
    public void checkSuccessfulCreateAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.makeLogin(EMAIL, PASSWORD);
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.openAccountsTab();
        accountsPage.openCreateAccountModel();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.saveNewAccountForm(GetNewAccountModel.getAccountWithAllFields());
        AlertMessagesPage alertMessagesPage = new AlertMessagesPage(driver);
        String actualAlertMessage = alertMessagesPage.alertMessageGetText();
        String expectedAlertMessage = "Account \"" + GetNewAccountModel.accountName + "\" was created.";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }
}