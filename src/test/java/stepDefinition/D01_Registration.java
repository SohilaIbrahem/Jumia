package stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P01_Task1;

import java.util.concurrent.TimeUnit;

public class D01_Registration {

    static Faker faker = new Faker();
    static String EMAIL = faker.internet().emailAddress();

    static final String FIRSTNAME = faker.name().firstName();
    static final String LASTNAME = faker.name().lastName();
    static String PASSWORD = faker.internet().password();
   static String PHONE = faker.phoneNumber().phoneNumber();
   static String DATE = faker.date().birthday().toString();
    WebDriver driver;

    @Given("User Open Jumia website")
    public void openWebsite()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://www.jumia.com.eg/");
    }

@When("User click on the Account Then Sign in")
    public void ClickOnAccount()
{
 new P01_Task1(driver).UserClickOnAccount().UserSelectSignInButton();
}

@And("User fill in the registration data and Submit")
    public void UserRegisterWithValidData_P()
{
new P01_Task1(driver).UserAddEmailField(EMAIL).UserSelectSignInButton().
        UserAddPassword(PASSWORD).UserAddConfirmPassword(PASSWORD).UserClickOnContinueButton_2().
        UserAddFirstName(FIRSTNAME).UserAddLastName(LASTNAME).UserAddPhoneNumber(PHONE).UserAddContinueButton_3().
        UserSelectGender().UserSelectDate(DATE).UserClickOnAgreeCheckBox().UserClickOnContinueButton_4();
}

@Then("User should have a new account on Jumia")
    public void ConfirmationMessage()
{

}

}
