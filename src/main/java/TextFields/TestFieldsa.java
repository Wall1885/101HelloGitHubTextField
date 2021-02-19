package TextFields;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFieldsa {

    public WebDriver driver;

    @BeforeTest(description = "This is to test the URL is called")
    void StartBrowser() {
        String projectPath;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:80/4textfields/1Index.html");
    }

    @Test(priority = 1, description = "This finds the password field, no data is entered, should get an error message")
    void TestOne() {
        WebElement first_name = driver.findElement(By.name("psd"));
        first_name.sendKeys("");
        System.out.println("The password field was left empty");
    }

    @Test(priority = 2, description = "Submit is pressed, an error message is displayed and accepted")
    void TestTwo() {
        By.xpath("//input[@id='sbt']").findElement(driver).click();
        System.out.println("Submit has been pressed and the following error message was displayed: 'Please enter your Password'");
        driver.switchTo().alert().accept();
    }

    @Test(priority = 3, description = "This finds the password field and enters 7 characters, should get an error message")
    void TestThree() {
        WebElement first_name = driver.findElement(By.name("psd"));
        first_name.sendKeys("1234567");
        System.out.println("7 characters were entered in the Password field should not be less than 8");
    }

    @Test(priority = 4, description = "Submit is pressed, an error message is displayed and accepted")
    void TestFour() {
        By.xpath("//input[@id='sbt']").findElement(driver).click();
        System.out.println("Submit has been pressed and the following error message was displayed: 'Password must be more than 8 characters long'");
        driver.switchTo().alert().accept();
    }

    @Test(priority = 5, description = "This finds the password field and enters 17 characters, should get an error message")
    void TestFive() {
        WebElement first_name = driver.findElement(By.name("psd"));
        first_name.sendKeys("12345678901234567");
        System.out.println("17 characters were entered in the Password field should not be more than 16");
    }

    @Test(priority = 6, description = "Submit is pressed, an error message is displayed and accepted")
    void TestSix() {
        By.xpath("//input[@id='sbt']").findElement(driver).click();
        System.out.println("Submit has been pressed and the following error message was displayed: 'Password cannot be more than 16 characters long'");
        driver.switchTo().alert().accept();
    }

    @Test(priority = 7, description = "Enter the correct password and should be accepted")
    void TestSeven() {
        WebElement first_name = driver.findElement(By.name("psd"));
        first_name.sendKeys("1234567890123456");
        System.out.println("The correct Password has been entered");
        // Capturing alert message.
        //String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message
        //System.out.println(alertMessage);
    }

    @Test(priority = 8, description = "This is to ok the alert message")
    void TestEight() {
        By.xpath("//input[@id='sbt']").findElement(driver).click();
        System.out.println("Submit has been pressed and Password has been accepted");
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().getText();
        //Alert confirmation = driver.switchTo().alert();
        //String alerttext = confirmation.getText();
        //System.out.println(alerttext);
    }

    @Test(priority = 9, description = "This is to test that the browser closes")
    void TestNine() {
        driver.manage().deleteAllCookies();
        driver.close();
        System.out.println("Browser has been closed");
    }
}









