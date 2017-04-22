import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Работа с элекментами формы авторизации
 */
public class InitializeLoginPage
{
    WebElement el;
/**Поиск поля для ввода логина**/
    public Boolean FindElementFieldLogin(InitializeAndQuitChromeDriver iaqc, String elementID, String Login)
    {
        try {
            el = iaqc.wd.findElement(By.id(elementID));
            el.sendKeys(Login);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;

    }
    /**Поиск поля для ввода пароля**/
    public Boolean FindElementFieldPassword(InitializeAndQuitChromeDriver iaqc, String elementID, String Password)
    {
        try {
            el = iaqc.wd.findElement(By.id(elementID));
            el.sendKeys(Password);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Поиск кнопки "Войти"**/
    public Boolean FindElementButtonLogin(InitializeAndQuitChromeDriver iaqc, String elementID)
    {
        try {
            el = iaqc.wd.findElement(By.id(elementID));

        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Нажатие кнопки войти**/
    public Boolean ElementButtonLoginClick(InitializeAndQuitChromeDriver iaqc, String elementID)
    {
        try {
            el = iaqc.wd.findElement(By.id(elementID));
            el.click();
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }



}
