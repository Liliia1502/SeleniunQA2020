package org.itstep.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Запустить браузер
// Открыть http://google.com
// В поисковую строку ввести текст для поиска (текст может быть любым)
// Протестируйте строку "Результатов: примерно 9 220"(число у всех разное), без учета времени на поиск.
// Если количество результатов разное - тест не пройден и наоборот.
public class home_work4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://google.com");
        System.out.println("Start test");
       // String url = "https://www.google.com.ua/";
        //webDriver.get(url);

        WebElement login = webDriver.findElement(By.name("q"));
        login.sendKeys("купить джекфрут в новомосковске украина");
        login.submit();

        webDriver.findElement(By.cssSelector("#result-stats"));
        String Str = new String("Результатов: примерно 1 670");
        if (Str.startsWith("Результатов: ")) ;
        {
            System.out.println("tru");
        }
        if (Str.startsWith("Результатов: примерно 1 670")) ;
        {
            System.out.println("tru");
        }

        if (Str.startsWith("Результатов: примерно 1 670 (0,83 сек.) ")) ;
        {

            System.out.println("false");
        }
        webDriver.quit();
        System.out.println("End test");
    }
}


















