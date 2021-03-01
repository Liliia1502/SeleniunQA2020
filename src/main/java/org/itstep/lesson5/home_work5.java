package org.itstep.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

///1. Открыть веб-браузер и загрузить страницу select_hw.html.
     //   2. В первом выпадающем списке "Select one" необходиом выбрать
     //   "Volvo" используя метод SelectByIndex класса SelectElement
     //   3. Проверить наличие строки "value:volvo" в output элементе с id = out1
     //   4. Далее выбрать "Saab" используя метод SelectByValue класса SelectElement
     //   5. Проверить наличие строки "value:saab" в output элементе с id = out1
     //   6. Далее выбрать "Mersedes" используя метод SelectByText класса SelectElement
     //   7. Проверить наличие строки "value:mersedes" в output элементе с id = out1

    public class home_work5 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();
            webDriver.navigate().to("file:///C:/Users/%D0%9B%D0%B8%D0%BB%D0%B8%D1%8F/Downloads/Lesson4%20hw/select_hw.html");
            WebElement selectElement = webDriver.findElement(By.cssSelector("#auto"));// #out2
            Select select = new Select(selectElement);

            List<WebElement> options = select.getOptions();
            select.selectByIndex(1);
            String output = webDriver.findElement(By.id("out1")).getText();
            if (output.equals("value:volvo")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
            Thread.sleep(2000);

            select.selectByValue("saab");
            String output1 = webDriver.findElement(By.id("out1")).getText();
            if (output1.equals("value:saab")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
            Thread.sleep(2000);

            select.selectByVisibleText("Mercedes");
            String output2 = webDriver.findElement(By.id("out1")).getText();
            if (output2.equals("value:mercedes")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
            Thread.sleep(2000);


            webDriver.quit();

        }
    }




