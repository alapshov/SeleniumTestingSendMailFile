import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Работа с элекментами формы авторизации
 */
public class InitializeLoginPage
{
    WebElement el;
/**Поиск поля для ввода логина**/
    public Boolean FindElementFieldLogin(InitializeAndQuitChromeDriver iaqc, String Login)
    {
        try {
            el = iaqc.wd.findElement(By.id("mailbox__login"));
            el.sendKeys(Login);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;

    }
    /**Поиск поля для ввода пароля**/
    public Boolean FindElementFieldPassword(InitializeAndQuitChromeDriver iaqc, String Password)
    {
        try {
            el = iaqc.wd.findElement(By.id("mailbox__password"));
            el.sendKeys(Password);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Поиск кнопки "Войти"**/
    public Boolean FindElementButtonLogin(InitializeAndQuitChromeDriver iaqc)
    {
        try {
            el = iaqc.wd.findElement(By.id("mailbox__auth__button"));

        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Нажатие кнопки войти**/
    public Boolean ElementButtonLoginClick(InitializeAndQuitChromeDriver iaqc)
    {
        try {
            el = iaqc.wd.findElement(By.id("mailbox__auth__button"));
            el.click();
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }



}
