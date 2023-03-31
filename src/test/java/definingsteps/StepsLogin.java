package definingsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepsLogin {
    public static WebDriver driver;

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:\\selinium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }
    @When("i have valid id & password")
    public void i_have_id_and_password() {

    }
    @Then("i can login should see dashboard")
    public void i_can_login_should_see_dashboard() {
        driver.get("https://www.facebook.com/");
        driver.close();

    }
}