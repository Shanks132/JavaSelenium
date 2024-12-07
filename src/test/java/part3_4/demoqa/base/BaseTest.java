package part3_4.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;//same methods like click setDriver and all so doesnt really matter
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static Utilities.utility.setUtilityDriver;
import static com.base.BasePage.delay;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String DEMOQA_URL="https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage=new BasePage();
        basePage.setWebDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();

    }

    @AfterClass
    public void tearDown()  {
        delay(3000);
        driver.quit();
    }
}
