import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Алексей on 22.04.2017.
 */
public class InitializeAndQuitChromeDriver {

    public WebDriver wd;

    public void InitializeChromeDriver()
    {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://mail.ru/");
    }
    public void QuitCromeDriver()
    {
        wd.quit();
    }
}
