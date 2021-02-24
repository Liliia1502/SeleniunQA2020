package org.itstep.lesson6;
//Протестировать оставишиеся iframe.
 import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work8 {
 public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
  WebDriver webDriver = new ChromeDriver();
  System.out.println("Start test");
  webDriver.get(" file:///C:/Users/F7B9~1/AppData/Local/Temp/Rar$EXa7968.44442/Lesson5%20hw/windows.html");
  WebElement iframe = null;
  try {
   iframe =  webDriver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
  }catch (NotFoundException e){
   System.out.println("Элемент не найден");
  }

  WebDriver frame = webDriver.switchTo().frame(iframe);

  WebElement select =  frame.findElement(By.cssSelector("body > h1"));
  select.click();
  Thread.sleep(2000);
  webDriver.quit();
  System.out.println("End test");
 }
}



