package org.itstep.lesson6;
//Протестировать модальные окна Prompt и Confirm.

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test1");
        webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7968.44442/Lesson5%20hw/windows.html");
        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector("#prompt > button"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            ;
            Alert alert = targetLocator.alert();
            String expectedText = "How old are you? ";
            String actualText = alert.getText();
            if (expectedText.equals(actualText)) {
                System.out.println("Passed");
            } else {
                System.out.println("Модальное окно содержит текст " + actualText);
            }
            alert.accept();
            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден");
        }
        System.out.println("End test1");
        Thread.sleep(2000);
        System.out.println("Start test2");
        try {
            button = webDriver.findElement(By.cssSelector("#promt > button"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();
            alert.dismiss();

            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден");
        }


        System.out.println("End test2");
        Thread.sleep(2000);

        String output = webDriver.findElement(By.cssSelector("#prompt > span:nth-child(2)")).getText();
        if (output.equals("18")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");

        }
        System.out.println("Все прошло хорошо");
    }
}
















