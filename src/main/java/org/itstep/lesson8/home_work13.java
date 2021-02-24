package org.itstep.lesson8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
import java.awt.*;
//Получить title окна - должен быть "Комп’ютерна Академія ШАГ | Дніпро"
public class home_work13 {
    private static Label alert;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa15820.6684/Lesson7%20hw/windows.html");
        System.out.println("Start test1");
        //WebElement btn = webDriver.findElement(By.cssSelector(" #academy_app"));
        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector("#button1 "));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();
            alert.accept();
        }catch (NoSuchElementException e){
            //System.out.println("Элемент не найден");
        }
        Thread.sleep(3000);
             if(webDriver.getTitle().contains(" Комп’ютерна Академія ШАГ | Дніпро"))
            //Pass
            System.out.println("Page title contains"  + "Комп’ютерна Академія ШАГ | Дніпро ");
        else
            //Fail
            System.out.println("Page title doesn't contains =" + "Комп’ютерна Академія ШАГ | Дніпро" );
        //System.out.println("Title = " + webDriver.getTitle());
        //String main = webDriver.getWindowHandle();//имя текущего окна

        //System.out.println("Before open window");
        webDriver.quit();
        System.out.println("End test");
    }
}



