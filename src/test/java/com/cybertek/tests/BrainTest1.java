package com.cybertek.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrainTest1 {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("version", "11");
        desiredCapabilities.setCapability("deviceName", "RWKR4PU47DE6ZLNV");
        desiredCapabilities.setCapability("appPackage", "com.unicostudio.braintest3");
        desiredCapabilities.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");
        desiredCapabilities.setCapability("autoMationName", "UiAutomator2");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
       scroll(805, 1355, 384, 384);
       scroll(146, 921, 253, 1281);

//        (new TouchAction(driver))
//                .press({x: 201, y: 1172})
//      .moveTo({x: 821: y: 827})
//      .release()
//                .perform()
//        (new TouchAction(driver))
//                .press({x: 525, y: 1077})
//      .moveTo({x: 519: y: 1095})
//      .release()
//                .perform()
//        (new TouchAction(driver))
//                .press({x: 320, y: 1617})
//      .moveTo({x: 848: y: 1114})
//      .release()
//                .perform()
//        (new TouchAction(driver))
//                .press({x: 839, y: 1083})
//      .moveTo({x: 848: y: 1089})
//      .release()
//                .perform()
//        (new TouchAction(driver))
//                .press({x: 1016, y: 848})
//      .moveTo({x: 1001: y: 848})
//      .release()
//                .perform()
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * This method scrolls based upon the passed parameters
     * @author Bill Hileman
     * @param  startx - the starting x position
     * @param  starty - the starting y position
     * @param  endx - the ending x position
     * @param  endy - the ending y position
     */
    @SuppressWarnings("rawtypes")
    public void scroll(int startx, int starty, int endx, int endy) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release()
                .perform();


    }
}

