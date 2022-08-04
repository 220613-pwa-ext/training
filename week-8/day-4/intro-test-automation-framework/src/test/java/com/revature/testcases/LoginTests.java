package com.revature.testcases;

import com.revature.pages.LoginPage;
import com.revature.pages.SuccessPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginTests {

    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This runs before the test suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This runs after the test suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This runs before the test category");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This runs after the test category");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This runs before the test class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This runs after the test class");
    }

    @BeforeMethod // Used to set up a resource before each test case
    public void setup() {
        System.out.println("This runs before each test case");
        // Step 0 (Automation setup): Setup WebDriver
        WebDriverManager.chromedriver().setup(); // go and download chromedriver.exe (windows) or chromedriver (mac)

        driver = new ChromeDriver();
    }

    @AfterMethod // Commonly used to "clean up" resources after each test case
    public void tearDown() {
        System.out.println("This runs after each test case");
        driver.quit();
    }

    @DataProvider(name="validLogins")
    public Object[][] provideValidLogins() throws IOException {
        // Write some code that will read an excel spreadsheet and extract data from it into a 2D Object array
        File file = new File("src/test/resources/valid_logins.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);
        Iterator<Row> rowIterator = mySheet.iterator();

        int numOfRows = mySheet.getPhysicalNumberOfRows();
        XSSFRow row = mySheet.getRow(0);
        int numOfCols = row.getLastCellNum();

        Object[][] logins = new Object[numOfRows][numOfCols];

        for (int i = 0; i < numOfRows; i++) {
            XSSFRow loginRow = mySheet.getRow(0);

            String un = loginRow.getCell(0).getStringCellValue();
            String pw = loginRow.getCell(1).getStringCellValue();

            logins[i][0] = un;
            logins[i][1] = pw;
        }

        return logins;
        // Object[][] is a 2D object array
        // Each "row" is data for a single test case
        // The columns are the parameters for that particular test method
    }

    @Test(dataProvider="validLogins")
    public void validLogin(String username, String password) {
        // Step 1. Go to login page
        driver.get("http://127.0.0.1:5500"); // URL for frontend
        LoginPage loginPage = new LoginPage(driver);

        // Step 2. Enter valid username
        loginPage.getUsernameInput().sendKeys(username);

        // Step 3. Enter valid password
        loginPage.getPasswordInput().sendKeys(password);

        // Step 4. Click on login button
        loginPage.getLoginButton().click();

        // Assert actual == expected
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // if what we are waiting for does not appear within 10 seconds, automatically fail
        // the test case by throwing an exception
        wdw.until(ExpectedConditions.urlToBe("http://127.0.0.1:5500/success.html")); // explicit wait
        // WebDriverWait, will constantly poll the browser every 500ms to see if the expected condition (being redirected
        // to /success.html) actually occurred
        // It will do so for a maximum of 10 seconds. If after 10 seconds the expected condition is still not met, then
        // it will throw an exception (TimeoutException) (which will fail our test case)

        SuccessPage successPage = new SuccessPage(driver);

        Assert.assertEquals(driver.getTitle(), "Success!");
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:5500/success.html");
        Assert.assertTrue(successPage.getMainHeading().isDisplayed());
    }

}
