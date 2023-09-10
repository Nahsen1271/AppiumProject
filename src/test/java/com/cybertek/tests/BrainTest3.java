package com.cybertek.tests;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.AltPortForwarding;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BrainTest3 {
  public static AltDriver altDriver;
   public static AppiumDriver appiumDriver;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("version", "12");
        desiredCapabilities.setCapability("deviceName", "ZY22G8RFZ4");
        desiredCapabilities.setCapability("appPackage", "com.unicostudio.braintest3");
        desiredCapabilities.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1000000);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");


        appiumDriver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
        AltPortForwarding.forwardAndroid();
        altDriver = new AltDriver();
    }

    @Test
    public void brainTest3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Testte başlandı");
        Thread.sleep(1000);
        letsGoButton().click(); Thread.sleep(2000);
        yesButton().click();Thread.sleep(2000);
       SettingsButton().click();Thread.sleep(2000);
        System.out.println("Setting Testtine başlandı");
        LanguageSelectButton().click();

        selectAlanguage("DE").click();Thread.sleep(1000);
        LanguageSelectButton().click();Thread.sleep(1000);
        selectAlanguage("RU").click();Thread.sleep(1000);
        LanguageSelectButton().click();Thread.sleep(1000);
        selectAlanguage("EN").click();Thread.sleep(1000);
        String soundText=  soundText().getText();
        String musicText = musicText().getText();
        String notificationText = notificationText().getText();
        Assert.assertEquals("SOUND", soundText);
        Assert.assertEquals("MUSIC", musicText);
        Assert.assertEquals("NOTIFICATION", notificationText);
        soundOffButton().click(); Thread.sleep(1000);
        soundOnButton().click(); Thread.sleep(1000);
        musicOffButton().click(); Thread.sleep(1000);
        musicOnButton().click(); Thread.sleep(1000);
        notificationOffButton().click(); Thread.sleep(1000);
        notificationOnButton().click(); Thread.sleep(1000);
        tryOurOtherGames().click();Thread.sleep(3000);
     //   zenLifePB().tap(); Thread.sleep(3000);appiumDriver.navigate().back();Thread.sleep(3000);
     //   brainTestPB().tap(); Thread.sleep(3000);appiumDriver.navigate().back();Thread.sleep(3000);
     //   whoIsPB().tap(); Thread.sleep(3000);appiumDriver.navigate().back();Thread.sleep(3000);
        backButtonForOtherGames().click(); Thread.sleep(3000);
     //   support().click(); Thread.sleep(3000);appiumDriver.navigate().back();Thread.sleep(3000);
        shareButton().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        twitterButton().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        instagramButton().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        facebookButton().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        PrivacyPolicy().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        TermsOfUse().click(); Thread.sleep(2000);appiumDriver.navigate().back();Thread.sleep(3000);
        backButton().click(); Thread.sleep(1000);
        System.out.println("MainPage'deyiz.");
        tapToPlayButton().click();Thread.sleep(1000);
        System.out.println("Level_1'deyiz...");
        gundolf().click();
        swipeMethod(gundolf(),alyxKickPoint()); Thread.sleep(3000);
        claimDailyButton().click(); Thread.sleep(5000);
        claimButton().click(); Thread.sleep(5000);
        nextButton().click(); Thread.sleep(5000);
        System.out.println("Level_2'deyiz...");
        swipeMethod(alyx(),alyxDragLimit());Thread.sleep(5000);
        swipeMethod(barrelWithAlyx(),trolley());Thread.sleep(5000);
        nextButton().click(); Thread.sleep(5000);
        System.out.println("Level_3'deyiz...");
        hintButton().click();Thread.sleep(3000);
        hint0Locked().click();Thread.sleep(13000);
        tapByCoordinates(100,100);
        helpButton().click();Thread.sleep(13000);
        nextButton().click(); Thread.sleep(5000);
        System.out.println("Rate_Us'dayız...");
        starFive().click();Thread.sleep(3000);
        submitButton().click(); Thread.sleep(5000);
        missThisChance().click(); Thread.sleep(3000);
        System.out.println("Level4'deyiz...");
       /* swipeMethod(bustDraggable(),bustplatforn()); Thread.sleep(7000);
        System.out.println("Bust Platforma yerleşti");
        swipeMethod(platformStrecher(),strRefPoint()); Thread.sleep(5000);*/
        hintButton().click();Thread.sleep(3000);
        hint0Locked().click();Thread.sleep(3000);
        hint1Locked().click();Thread.sleep(3000);
        tapByCoordinates(100,100);
        helpButton().click();Thread.sleep(5000);
        helpButton().click();Thread.sleep(3000);
        System.out.println("Sutünü yukarı aldım");Thread.sleep(5000);
        System.out.println("Continue With Ads");
        continueWithAds().click(); Thread.sleep(5000);
        try {
          //  WebDriverWait wait = new WebDriverWait(appiumDriver, 80);
         //   MobileElement skipAds= (MobileElement) appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View"));
        //    By.ByXPath elementLocator= (By.ByXPath) By.ByXPath.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
         //   MobileElement skipAds= (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
         //   skipAds.click();
            appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View")).click();

        }catch (Exception ads){
            System.out.println("There is no ads");
        }
        appiumDriver.closeApp();Thread.sleep(3000);
        appiumDriver.activateApp("com.unicostudio.braintest3");Thread.sleep(7000);
        tapToPlayButton().click(); Thread.sleep(3000);
        swipeMethod(cake(),lvl5_trap()); Thread.sleep(3000);
        door().tap(); Thread.sleep(11000);
        appiumDriver.closeApp();Thread.sleep(3000);
        appiumDriver.activateApp("com.unicostudio.braintest3");Thread.sleep(7000);
        tapToPlayButton().click(); Thread.sleep(3000);




    }

    @After
    public void tearDown() {
    //    appiumDriver.quit();
    }

    public void swipeMethod(AltObject APoint,AltObject bPoint){
        altDriver.swipe(new AltSwipeParams.Builder(APoint.getScreenPosition(),bPoint.getScreenPosition()).withDuration(2).build());
    }
    public void tapByCoordinates (int x,  int y) {
    new TouchAction(appiumDriver)
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }
    public AltObject firstSkipButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SkipButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject letsGoButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Button").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject yesButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "YesButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject SettingsButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SettingsButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);//
    }

    public AltObject languageCloseButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "CloseButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject soundText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SoundText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject musicText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationText(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject soundOffButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/SettingsPanel/SoundOffButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject soundOnButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/SettingsPanel/SoundOnButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);///

    }
    public AltObject musicOffButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicOffButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject musicOnButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicOnButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationOffButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationOffButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationOnButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationOnButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject tryOurOtherGames(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/SettingsPanel/OtherGames").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject zenLifePB(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/OtherGamesScroll/Viewport/Content/ZenLife/PlayNow").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// /Canvas/OtherGamesScroll/Viewport/Content/BrainTest/PlayNow
    }
    public AltObject brainTestPB(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/OtherGamesScroll/Viewport/Content/BrainTest/PlayNow").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// /Canvas/OtherGamesScroll/Viewport/Content/WhoIs/PlayNow
    }
    public AltObject whoIsPB(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/OtherGamesScroll/Viewport/Content/WhoIs/PlayNow").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// /CanvasUI/BackButton
    }
    public AltObject backButtonForOtherGames(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/BackButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// /CanvasUI/BackButton
    }

    public AltObject support(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SupportButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject LanguageSelectButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageSelectButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject [] LanguagesText(){
        AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Text").
                isEnabled(true).build();
        return altDriver.findObjects(par);
    }

    public AltObject selectAlanguage(String language){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/LanguagePanel/Popup/Items/"+language).
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject backButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BackButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject shareButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ShareButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// OtherGames
    }
    public AltObject twitterButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TwitterButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject instagramButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "InstagramButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject facebookButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "FacebookButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject settingsTitle(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Title").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject PrivacyPolicy(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "PrivacyPolicy").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// ShareButton
    }

    public AltObject TermsOfUse(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TermsOfUse").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);//
    }
        // LEVEL_1
    public AltObject tapToPlayButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/BottomMenu/TapToPlay").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(100).build();
        return altDriver.waitForObject(params);//  /Canvas/BottomMenu/TapToPlay
    }
    public AltObject gundolf(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/Gundolf/raycastTarget (1)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject alyxKickPoint(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/alyx (1)/raycastTarget").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(19).build();
        return altDriver.waitForObject(params);
    }
    public AltObject claimDailyButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/DailyRewardScreen/DailyBG/frame/1").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject claimButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/DailyRewardScreen/DoubleReward/ClaimButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject nextButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/NonAction/buttonNext").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
        // LEVEL_2
    public AltObject alyx(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/alyx (1)/raycastTarget").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject alyxDragLimit(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/lvl14_barrel (1)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject barrelWithAlyx(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/BarrelWithAlyx").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject trolley(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/Thug1/NS2_Trolley").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
        //LEVEL_3
    public AltObject hintButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/HintButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject hint0Locked(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/HintPanel/Scroll View/Viewport/Items/Hint0Locked").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject hint1Locked(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/HintPanel/Scroll View/Viewport/Items/Hint1Locked").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject helpButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/HelpButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject starFive(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/RatePanel/Star5").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject submitButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/RatePanel/SubmitButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject missThisChance(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Panel/MissThisChance").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
        //LEVEL_4
    public AltObject bustDraggable(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/BustDraggable").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject bustplatforn (){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bust_platforn").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject platformStrecher (){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/PlatformStrecher").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject strRefPoint(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/StrRefPoint").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject continueWithAds(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/CanvasUI/NoAdsOffer/Panel/Window/NoButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject skipGondolpLevel(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/UI (1)/SkipButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    // LEVEL_5
    public AltObject lvl5_trap(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bg/lvl3_trap").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject cake(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bg/cake").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject door(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bg/door").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    // LEVEL_6
    public AltObject sling(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bg/sling").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }    public AltObject stone(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/bg/stone").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }    public AltObject alyxImage(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/Mask/alyx/alyxImage").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    //LEVEL_7
    public AltObject choice0(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/Level/choice0").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject spinWheelSkipButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.PATH, "/Canvas/UI/SkipButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    //LEVEL_9

}

