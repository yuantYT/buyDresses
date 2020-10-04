package base;

import base.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Set;
import static java.lang.Thread.sleep;

public class AddDress {
    public WebDriver driver;
    private String absPath = System.getProperty("user.dir");
    private JavascriptExecutor js;
    Accounts account=new Accounts();


    public AddDress()  {
        System.setProperty("webdriver.chrome.driver", absPath + "/drivers/chromedriver.exe");
        this.driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");


    }

    @Test
    public void goToDress() throws InterruptedException{
        sleep(500);

        System.out.println("click on Dresses tab");
        WebElement dressesTab=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]"));
        dressesTab.click();

       System.out.println("go to summer dresses and click");
       WebDriverWait wait=new WebDriverWait(driver,5);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='categories_block_left']//ul/li[3]")));
       WebElement summerDress= driver.findElement(By.xpath("//div[@id='categories_block_left']//ul/li[3]"));
       wait.until(ExpectedConditions.elementToBeClickable(summerDress));
       summerDress.click();

        System.out.println("maximize the browser window");
        driver.manage().window().maximize();

        System.out.println("scroll to the dress I want to buy");
        WebElement chiffonDress=driver.findElement(By.xpath("//div[@id='center_column']/ul/li[3]/div/div[2]/h5/a"));
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",chiffonDress);
        sleep(4000);

        System.out.println("click the wanted dress to go to the detailed page");
        wait.until(ExpectedConditions.elementToBeClickable(chiffonDress));
        chiffonDress.click();
        sleep(3000);
        System.out.println("current url: "+driver.getCurrentUrl());


        System.out.println("click add to cart button");
        WebElement addButton=driver.findElement(By.xpath("//p[@id='add_to_cart']/button[@type='submit']"));
        addButton.click();
        sleep(8000);


        System.out.println("click checkout to proceed");
        WebElement checkout=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        checkout.click();
        sleep(3000);


        System.out.println("scroll to the proceed to check out button  and click");
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='center_column']/p[2]/a[1]")));
        WebElement proceedCheck=driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a[1]"));
        proceedCheck.click();


        System.out.println("-----------------------------------------------------------------------");

        System.out.println("fill an email and click create");
        WebElement emailAddress=driver.findElement(By.xpath("//input[@id='email_create']"));
        emailAddress.sendKeys(account.getEmail());
        WebElement createAccount=driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        createAccount.click();
        System.out.println("current url: "+driver.getCurrentUrl());


        System.out.println("select gender: Mrs");
        sleep(6000);
        WebElement gender=driver.findElement(By.xpath("//input[@id='id_gender2' and @value='2']"));
        gender.click();


        System.out.println("input first name");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys(account.getFirstName());


        System.out.println("input last name");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys(account.getLastName());

        System.out.println("input password");
        WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys(account.getPassword());



        System.out.println("select day of birth");
        WebElement day=driver.findElement(By.xpath("//select[@id='days']"));
        day.click();
        Select selectDay = new Select(day);
        selectDay.selectByValue("1");

        System.out.println("select month of birth");
        WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("1");


        System.out.println("select year of birth");
        WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
        year.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("2015");


        System.out.println("Input address");
        WebElement address=driver.findElement(By.xpath("//input[@id='address1']"));
        address.sendKeys(account.getAddress());


        System.out.println("Input city");
        WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys(account.getCity());

        System.out.println("select state");
        WebElement state=driver.findElement(By.xpath("//select[@id='id_state']"));
        Select selectState = new Select(state);
        selectState.selectByValue("1");


        System.out.println("Input zip code");
        WebElement zipCode=driver.findElement(By.xpath("//input[@id='postcode']"));
        zipCode.sendKeys(account.getZipCode());


        System.out.println("Input mobilePhone");
        WebElement mobilePhone=driver.findElement(By.xpath("//input[@id='phone_mobile']"));
        mobilePhone.sendKeys(account.getMobilePhone());


        System.out.println("AddressAlias");
        WebElement AddressAlias=driver.findElement(By.xpath("//input[@id='alias']"));
        AddressAlias.clear();
        AddressAlias.sendKeys(account.getAddressAlias());


        System.out.println("Click register button");
        WebElement register=driver.findElement(By.xpath("//button[@id='submitAccount']"));
        register.click();


    }




























}
