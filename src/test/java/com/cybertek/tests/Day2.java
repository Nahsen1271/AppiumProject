package com.cybertek.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Day2 {

    AppiumDriver<MobileElement> driver;

    @Test
    public void SauceLabsTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appiumVersion", "1.17.1");
        desiredCapabilities.setCapability("deviceName","Samsung Galaxy S8 FHD GoogleAPI Emulator");
        desiredCapabilities.setCapability("deviceOrientation", "portrait");
        desiredCapabilities.setCapability("browserName", "");
        desiredCapabilities.setCapability("platformVersion","8.0");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //to specfiy app for testing
        //it can be on your computer or somewhere in cloud
        desiredCapabilities.setCapability("app","https://cybertek-appium.s3.amazonaws.com/etsy.apk");
        driver = new AppiumDriver<>(new URL("https://jamaldemir:eeb12eac-37ce-4d1c-a0f1-501e2583b1be@ondemand.us-west-1.saucelabs.com:443/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);

        MobileElement you = driver.findElement(MobileBy.AccessibilityId("You tab, 4 of 5"));
        you.click();
        Thread.sleep(2000);

        MobileElement settings = driver.findElement(By.xpath("//*[@text='Settings']"));
        settings.click();
        Thread.sleep(2000);

        MobileElement checkbox = driver.findElement(By.id("com.etsy.android:id/settings_checkbox"));
        checkbox.click();
        Thread.sleep(3000);

        //verify after click the checkbox it is not selected
        Assert.assertFalse(driver.findElement(By.id("com.etsy.android:id/settings_checkbox")).isSelected());
        Thread.sleep(1000);



        driver.closeApp();

    }
}
