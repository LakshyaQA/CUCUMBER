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
        // Write code here that turns the phrase above into concrete actions

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:\\selinium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);


        /*ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
        WebDriver driver = new ChromeDriver(ops) ;
        ChromeOptions options;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:\\selinium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(ops);*/


    }

    @When("i have valid id & password")
    public void i_have_id_and_password() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.facebook.com/");

    }

    @Then("i can login should see dashboard")
    public void i_can_login_should_see_dashboard() {

        driver.close();

    }
}