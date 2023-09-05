package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SigninPage {
    public static WebDriver driver;

    @Given("the user in the forgot password page")
    public void the_user_in_the_forgot_password_page() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.skillrack.com/faces/resetpassword.xhtml");


    }
    @When("user clicks the signin option")
    public void user_clicks_the_signin_option() {
        driver.findElement(By.xpath("//*[@id=\"j_id_6:j_id_k\"]/ul/li[3]/a/span[2]")).click();

    }
    @Then("user see the signin page")
    public void user_see_the_signin_page() {
        driver.findElement(By.xpath("//*[@id=\"j_id_6:j_id_k\"]/ul/li[3]/a/span[2]")).click();

    }


}
