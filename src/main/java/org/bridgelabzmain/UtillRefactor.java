package org.bridgelabzmain;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class UtillRefactor extends Base {
    public static void takeScreenshots(String fileName) throws IOException,NullPointerException {
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File( "C:\\Users\\ankit\\Desktop\\testngGoogleSeleniumTest" +
                "\\src\\main\\java\\org\\bridgelabzmain"+ fileName + ".jpg"));
    }
}

