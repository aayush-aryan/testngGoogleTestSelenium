package bridgelabz;
import org.bridgelabzmain.Base;
import org.bridgelabzmain.UtillRefactor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.IOException;


public class GoogleTest extends Base {


    @Test
    public void googleTitlePage() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void googleLogoTest(){
        boolean b = driver.findElement(By.xpath("//IMG[@class='lnXdpd']")).isDisplayed();
    }
    @Test
    public void googleScreenShots() throws IOException  {

        try {
            UtillRefactor.takeScreenshots("google_Home");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
