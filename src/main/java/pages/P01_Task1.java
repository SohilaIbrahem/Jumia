package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.utlity;

public class P01_Task1 {

    private WebDriver driver;
    Select select;

    //Constructor
    public P01_Task1(WebDriver driver) {
        this.driver = driver;
    }

    private final By Account = By.xpath("(//label[@class=\"trig -df -i-ctr -fs16\"])[1]");
    private final By SignInButton = By.xpath("//a[@class=\"btn _prim -fw _md\"]");
    private final By EmailField =By.xpath("//input[@id=\"input_identifierValue\"]");
    private final By ContinueButton =By.xpath("(//span[@class=\"mdc-button__label\"])[1]");
    private final By Password = By.xpath("//input[@name=\"password\"]");
    private final  By ConfirmPassword =By.xpath("(//input[@type=\"password\"])[2]");
    private final By ContinueButton_2 =By.xpath("(//span[@class=\"mdc-button__touch\"])[1]");
    private final By FirstName = By.xpath("//input[@id=\"input_first_name\"]");
    private final By LastName = By.xpath("//input[@id=\"input_last_name\"]");
    private final By PhoneNumber = By.xpath("//input[@name=\"phone[number]\"]");
    private final By ContinueButton_3 = By.xpath("(//span[@class=\"mdc-button__touch\"])[2]");
    private final By Gender = By.xpath("(//div[@class=\"mdc-select__anchor\"])[2]");
    private final By Date = By.xpath("//input[@id=\"input_birth_date\"]");
    private final By AgreeCheckBox =By.xpath("//input[@type=\"checkbox\"]");
    private final By ContinueButton_4 = By.xpath("(//span[@class=\"mdc-button__touch\"])[3]");


    public P01_Task1 UserClickOnAccount() {
        driver.findElement(this.Account).click();
        return this;
    }

    public P01_Task1 UserSelectSignInButton() {
        driver.findElement(this.SignInButton).click();
        return this;
    }

    public P01_Task1 UserAddEmailField(String email) {
        driver.findElement(this.EmailField).sendKeys(email);
        return this;
    }

    public P01_Task1 UserClickOnContinueButton() {
        driver.findElement(this.ContinueButton).click();
        return this;
    }

    public P01_Task1 UserAddPassword(String pass) {
        driver.findElement(this.Password).sendKeys(pass);
        return this;
    }

    public P01_Task1 UserAddConfirmPassword(String ConPass) {
        driver.findElement(this.ConfirmPassword).sendKeys(ConPass);
        return this;
    }

    public P01_Task1 UserClickOnContinueButton_2() {
        driver.findElement(this.ContinueButton_2).click();
        return this;
    }

    public P01_Task1 UserAddFirstName(String FName) {
        driver.findElement(this.FirstName).sendKeys(FName);
        return this;
    }

    public P01_Task1 UserAddLastName(String LName) {
        driver.findElement(this.LastName).sendKeys(LName);
        return this;
    }

    public P01_Task1 UserAddPhoneNumber( String Phone) {
        driver.findElement(this.PhoneNumber).sendKeys(Phone);
        return this;
    }

    public P01_Task1 UserAddContinueButton_3() {
        driver.findElement(this.ContinueButton_3).click();
        return this;
    }

    public P01_Task1 UserSelectGender() {
        select = new Select(driver.findElement(this.Gender));
        select.selectByIndex(utlity.generateRandomNumber(1, 2));
        return this;
    }

    public P01_Task1 UserSelectDate(String calender) {
        driver.findElement(this.Date).sendKeys(calender);
        return this;
    }

    public P01_Task1 UserClickOnAgreeCheckBox() {
        driver.findElement(this.AgreeCheckBox).click();
        return this;
    }

    public P01_Task1 UserClickOnContinueButton_4() {
        driver.findElement(this.ContinueButton_4).click();
        return this;
    }


}
