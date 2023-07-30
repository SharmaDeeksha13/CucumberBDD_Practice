import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo {

    @BeforeTest
    public void execute1() {
//        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver,chrome.driver","D://Softwares//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phoenixnap.com/kb/install-maven-windows");

        System.out.println("Hello Canada");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello USA");
        System.out.println("Hello India");
        System.out.println("Hello India changes done in Deeksha Branch");


    }
}
