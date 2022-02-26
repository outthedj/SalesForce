package salesforceelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFields {

    WebDriver driver;
    String label;
    String inputXpath = "//article[contains(., 'New Account')]//label[contains(., '%s')]/following-sibling::input";

    public InputFields(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void inputText(String text) {
        inputXpath = String.format(inputXpath, label);
        driver.findElement(By.xpath(inputXpath)).sendKeys(text);
    }
}
