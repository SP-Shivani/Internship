package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
    public static WebDriver driver;

    @Given("user navigate to the home page")
    public void user_navigate_to_the_home_page() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
        driver=new ChromeDriver(options);
        driver.get("https://www.skillrack.com/faces/candidate/codeprogram.xhtml");



    }
    @When("clicks on forgot password")
    public void clicks_on_forgot_password() {

        driver.findElement(By.xpath("//button[@class='ui button red ']")).click();
    }
    @Then("user sees forgot page")
    public void user_sees_forgot_page() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertNotEquals(driver.getTitle(),"Check Email / Reset Password for Skillrack.com");
        driver.close();
    }
}
