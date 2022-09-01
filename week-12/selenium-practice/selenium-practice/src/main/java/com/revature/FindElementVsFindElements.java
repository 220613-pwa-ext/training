package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500");

        // .findElement
        // returns the first occurrence of an element that matches the locator
        WebElement element1 = driver.findElement(By.className("a"));

        System.out.println(element1.getText()); // Heading 1

        // .findElements
        // returns a List of WebElement objects that match the locator
        List<WebElement> elements = driver.findElements(By.className("a"));

//        System.out.println(elements.get(0).getText());
//        System.out.println(elements.get(1).getText());
//        System.out.println(elements.get(2).getText());
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

        driver.quit();
    }

}
