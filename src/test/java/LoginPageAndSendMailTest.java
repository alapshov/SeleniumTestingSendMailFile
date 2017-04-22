import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Выполнение тестов
 */
public class LoginPageAndSendMailTest {

    InitializeAndQuitChromeDriver iaqc;
    InitializeLoginPage ilp;
    InizializeSendMail ism;
    boolean a;
@BeforeClass
    public void SetUp()
    {
        iaqc = new InitializeAndQuitChromeDriver();
        ilp = new InitializeLoginPage();
        ism = new InizializeSendMail();
        iaqc.InitializeChromeDriver();
    }
    @AfterClass
    public void tearDown()
    {
        iaqc.QuitCromeDriver();
    }

    @Test(priority = 1)
    
    public void InitializeLoginPage_FindElementFieldLogin_Test()
    {
        a =  ilp.FindElementFieldLogin(iaqc,"tester.testov.10");
        Assert.assertEquals(true,a);

    }

    @Test(priority = 2)
    public void InitializeLoginPage_FindElementFieldPasswordEnterPass_Test()
    {
        a = ilp.FindElementFieldPassword(iaqc,"TeSt12345678");
        Assert.assertEquals(true, a);
    }

    @Test(priority = 3)
    public void InitializeLoginPage_FindElementButtonLogin_Test()
    {
        a = ilp.FindElementButtonLogin(iaqc);
        Assert.assertEquals(true,a);
    }

    @Test(priority = 4)
    public void InitializeLoginPage_Autorization_Test()
    {

        a = ilp.ElementButtonLoginClick(iaqc);
        Assert.assertEquals(true,a);
    }

    @Test(priority = 5)
    public void  InizializeSendMail_FindAndClickButtonWriteLetter_Test()
    {
        a = ism.FindAndClickButtonWriteLetter(iaqc);
        Assert.assertEquals(true, a);
    }

    @Test(priority = 6)
    public void InizializeSendMail_FindAndReadMailAddres_Test()
    {
        a = ism.FindAndReadMailAddres(iaqc,"tester.testov.10@mail.ru");
        Assert.assertEquals(true,a);
    }

    @Test(priority = 7)
    public void InizializeSendMail_FindAndReadMailTheme_Test()
    {
        a = ism.FindAndReadMailTheme(iaqc,"Отправка файла");
        Assert.assertEquals(true,a);

    }
    @Test(priority = 8)
    public void InizializeSendMail_FindAndClickAttachFile_Test()
    {
        a = ism.FindAndClickAttachFile(iaqc,"D:\\SendFile.txt");
        Assert.assertEquals(true,a);
    }
    @Test(priority = 9)
    public void InizializeSendMail_FindAndClickSendMail_Test()
    {
        a = ism.FindAndClickSendMail(iaqc);
        Assert.assertEquals(true,a);
    }

}
