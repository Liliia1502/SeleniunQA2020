package org.itstep.lesson8;
//Получить все открытые окна и вывести их заголовки на консоль (использйте метод getWindowHandles)
// Закрыть последовательно все окна
// Закрыть браузер
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Collections;
import java.util.Set;

import static org.itstep.lesson7.WindowExample.showWindows;

public class home_work12 {
    private static Object Set;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7740.49606/Lesson7%20hw/windows.html");
        System.out.println("Start test1");
        WebElement btn = webDriver.findElement(By.cssSelector(" #button1 "));
        String main = webDriver.getWindowHandle();//имя текущего окна
        System.out.println("page 1 =" + main);

        showWindows(webDriver.getWindowHandles());
        btn.click();
        Thread.sleep(2000);
        showWindows(webDriver.getWindowHandles());
        String secondPgeHandle = "";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPgeHandle = windowHandle;
            if (!windowHandle.equals(main)) {
                break;
            }

            webDriver.quit();
            System.out.println("End test");

        }
    }
}






