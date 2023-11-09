import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Demo {

    @Test
    public void execute1() throws InterruptedException, AWTException {
//        System.setProperty("webdriver.chrome.driver", "C:\Users\deeks\Downloads\Maven_project\OctPomSeriesFramework-master\CucumberBDD_Practice\src\main\resources\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver","D://Softwares//ChromeAbove116//chromedriver-win64//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://phoenixnap.com/kb/install-maven-windows");
        driver.manage().window().maximize();
//        Dimension newDimension = new Dimension(800, 600);
//        driver.manage().window().setSize(newDimension);

//        WebElement html = driver.findElement(By.tagName("html"));
//        html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        Robot ribo = new Robot();
        for (int i = 0; i <= 4; i++) {
            ribo.keyPress(KeyEvent.VK_CONTROL);
            ribo.keyPress(KeyEvent.VK_SUBTRACT);
            ribo.keyRelease(KeyEvent.VK_SUBTRACT);
            ribo.keyRelease(KeyEvent.VK_CONTROL);
            i++;
        }
        Thread.sleep(3000);
        driver.close();

    }

}
