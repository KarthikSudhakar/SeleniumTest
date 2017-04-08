import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by Karthik on 4/8/2017.
 */
public class Sample {
    WebDriver driver;

    @Before
    public void setUp() throws Exception
    {
        System.setProperty("webdriver.chrome.driver","C://Users//Karthik//Desktop//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void testGoogle()
    {
        driver.get("https://www.google.com");
        String exprectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertEquals(exprectedTitle,actualTitle);

    }


}
