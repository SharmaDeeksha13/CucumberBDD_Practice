import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void execute1() {
//        System.setProperty("webdriver.chrome.driver", "C:\Users\deeks\Downloads\Maven_project\OctPomSeriesFramework-master\CucumberBDD_Practice\src\main\resources\\chromedriver.exe");
        System.setProperty("webdriver,chrome.driver","C://Users//deeks//Downloads//Maven_project//ctPomSeriesFramework-master//CucumberBDD_Practice//src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phoenixnap.com/kb/install-maven-windows");
        driver.manage().window().maximize();

        System.out.println("Hello Canada");
        System.out.println("Hello USA");
        System.out.println("Hello USA");



    }
}
