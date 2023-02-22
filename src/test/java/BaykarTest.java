import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class BaykarTest {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kariyer.baykartech.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
    @Test
    public void HomePage() {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //YERLEŞKELERİMİZ
        WebElement campus1 = driver.findElement(By.xpath("//a[normalize-space()='Özdemir Bayraktar Ar-Ge ve Üretim Merkezi']"));
        campus1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Özdemir Bayraktar Ar-Ge ve Üretim Merkezi, yemyeşi')]")));
        boolean EnableFirstCampus = driver.findElement(By.xpath("//p[contains(text(),'Özdemir Bayraktar Ar-Ge ve Üretim Merkezi, yemyeşi')]")).isDisplayed();
        if (EnableFirstCampus){
            System.out.println("Campus 1 Basarili");
        }else {
            System.out.println("Campus 1 Basarisiz");
            driver.quit();
        }
        WebElement campus2 = driver.findElement(By.xpath("//a[contains(text(),'Keşan Uçuş Eğitim ve Test Merkezi')]"));
        campus2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Keşan Uçuş Eğitim ve Test Merkezi’miz çalışmaların')]")));
        boolean EnableSecondCampus = driver.findElement(By.xpath("//p[contains(text(),'Keşan Uçuş Eğitim ve Test Merkezi’miz çalışmaların')]")).isDisplayed();
        if (EnableSecondCampus){
            System.out.println("Campus 2 Basarili");
        }else {
            System.out.println("Campus 2 Basarisiz");
            driver.quit();
        }
        WebElement campus3 = driver.findElement(By.xpath("//a[contains(text(),'Çorlu Uçuş Eğitim ve Test Merkezi')]"));
        campus3.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Çorlu Uçuş Eğitim ve Test Merkezi’miz çalışmaların')]")));
        boolean EnableThirdCampus = driver.findElement(By.xpath("//p[contains(text(),'Çorlu Uçuş Eğitim ve Test Merkezi’miz çalışmaların')]")).isDisplayed();
        if (EnableThirdCampus){
            System.out.println("Campus 3 Basarili");
        }else {
            System.out.println("Campus 3 Basarisiz");
            driver.quit();
        }
        //SUNDUĞUMUZ FAYADALAR
        WebElement egitim=driver.findElement(By.xpath("//li[@class='active']//div[@class='item']"));
        egitim.click();
        WebElement servisHizmetleri = driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        servisHizmetleri.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SERVİS HİZMETİ')]")));
        boolean services = driver.findElement(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SERVİS HİZMETİ')]")).isDisplayed();
        if (services){
            System.out.println("Services Succesful");
        }else {
            System.out.println("Services Failed");
            driver.quit();
        }
        WebElement sosyalYasam=driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        sosyalYasam.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SOSYAL YAŞAM')]")));
        boolean socialLife=driver.findElement(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SOSYAL YAŞAM')]")).isDisplayed();
        if (socialLife) {
            System.out.println("Sosyal Yasam Basarili");
        }else {
            System.out.println("Sosyal Yasam Basarisiz");
        }
        WebElement saglik=driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        saglik.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SAĞLIK')]")));
        boolean health = driver.findElement(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'SAĞLIK')]")).isDisplayed();
        if (health){
            System.out.println("Saglik Basarili");
        }else {
            System.out.println("Saglik Basarisiz");
        }
        WebElement kres= driver.findElement(By.xpath("//body[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        kres.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'KREŞ')]")));
        boolean nursery=driver.findElement(By.xpath("//div[@class='item-bottom-box']//h4[contains(text(),'KREŞ')]")).isDisplayed();
        if (nursery){
            System.out.println("Kres Basarili");
        }else{
            System.out.println("Kres Basarisiz");
        }
        //SOSYAL ALANLAR

        WebElement imgeOver = driver.findElement(By.xpath("//body[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]/i[1]"));
        action.moveToElement(imgeOver).click().build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='mfp-figure'] figure")));
        for (int i=0;i<10;i++){
            driver.findElement(By.cssSelector("button[title='Next (Right arrow key)']")).click();
        }
        driver.findElement(By.cssSelector("button[title='Close (Esc)']")).click();
        //SIKÇA SORULAN SORULAR
        driver.findElement(By.xpath("//body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Firmamıza iş başvurularınızı “Web Sitemiz” üzerind')]")).isDisplayed();

        driver.findElement(By.xpath("//body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Firmamıza iş başvurusunda bulunmuş tüm adaylarımız')]")).isDisplayed();

        driver.findElement(By.xpath("//body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Firmamıza ilettiğiniz iş başvurunuzla ilgili sürec')]")).isDisplayed();

        driver.findElement(By.xpath("//body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Firmamıza daha önce değerlendirmenizin yapıldığı a')]")).isDisplayed();
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
