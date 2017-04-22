import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Работа с элементами формы просмотра и создания и отправки сообщений
 */
public class InizializeSendMail {

    WebElement el;

/**Поиск и нажатие на кнопку "Написать письмо"**/
    public Boolean FindAndClickButtonWriteLetter(InitializeAndQuitChromeDriver iaqc)
    {
        try {
            el = iaqc.wd.findElement(By.xpath("//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span"));
            el.click();
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Поиск и запись в поле адреса отправки сообщения**/
    public Boolean FindAndReadMailAddres(InitializeAndQuitChromeDriver iaqc, String mailAddress)
    {
        try {
            el = iaqc.wd.findElement(By.xpath("//../div[1]/div/div[3]/div[1]/div/div/div[2]/div/div/div/textarea[2]"));
            el.sendKeys(mailAddress);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
    /**Поиск и запись в поле тема сообщения**/
    public Boolean FindAndReadMailTheme(InitializeAndQuitChromeDriver iaqc, String theme)
    {
        try {
            el = iaqc.wd.findElement(By.xpath("//../div[1]/div/div[3]/div[4]/div/div/div[2]/div/input"));
            el.sendKeys(theme);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
/**Поиск элемента и отправка в него пути к файлу**/
    public Boolean FindAndClickAttachFile(InitializeAndQuitChromeDriver iaqc, String PathFile)
    {
        try {
            el = iaqc.wd.findElement(By.cssSelector("input.compose-attachments__input.js-shortcut"));
            el.sendKeys(PathFile);
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
/**Поиск и нажатие на кнопку отправки сообщения**/
    public Boolean FindAndClickSendMail(InitializeAndQuitChromeDriver iaqc)
    {
        try {
            Thread.sleep(1000);
            el = iaqc.wd.findElement(By.cssSelector("#b-toolbar__right > div:nth-child(3) > div > div:nth-child(2) > div.b-toolbar__item.b-toolbar__item_.b-toolbar__item_false"));
            el.click();
        }
        catch (Exception ex)
        {
            return false;
        }
        return true;
    }
}
