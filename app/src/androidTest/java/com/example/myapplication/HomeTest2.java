package com.example.myapplication;

import android.view.KeyEvent;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
@RunWith(AndroidJUnit4ClassRunner.class)
public class HomeTest2 {

    @Test
    public void setUp(){
        UiDevice myDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        try {

            myDevice.pressHome();
            myDevice.pressKeyCode(170);

            myDevice.pressDPadUp();
            for(int i=0; i<4;i++) {
                myDevice.pressDPadRight();
            }
            myDevice.pressEnter();
            for(int i=0;i<6;i++) {
                myDevice.pressDPadDown();
            }
            myDevice.pressDPadRight();
            myDevice.pressBack();
            Thread.sleep(1000);
            myDevice.pressDPadLeft();
            myDevice.pressEnter();
            myDevice.pressDPadUp();
            myDevice.pressDPadUp();
            myDevice.pressDPadUp();
            myDevice.pressDPadUp();
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressEnter();
            Thread.sleep(3000);
            //Launch of Google Assistance
            myDevice.pressSearch();
            Thread.sleep(2000);
            myDevice.pressHome();
            UiObject youtubeApp= myDevice.findObject(new UiSelector().description("YouTube"));
            youtubeApp.click();
            Thread.sleep(8000);
            myDevice.pressDPadRight();
            myDevice.pressDPadRight();
            Thread.sleep(8000);
            myDevice.pressEnter();
            Thread.sleep(8000);
            myDevice.pressKeyCode(KeyEvent.KEYCODE_MEDIA_PAUSE);
            Thread.sleep(2000);
            myDevice.pressKeyCode(KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE);
            Thread.sleep(2000);
            myDevice.pressKeyCode(KeyEvent.KEYCODE_MEDIA_FAST_FORWARD);
            Thread.sleep(3000);
            myDevice.pressKeyCode(KeyEvent.KEYCODE_MEDIA_STOP);
            Thread.sleep(1000);
            myDevice.pressBack();
            Thread.sleep(3000);
            myDevice.pressHome();
            UiObject clickDemoMe =myDevice.findObject(new UiSelector().descriptionStartsWith("Demo"));
            //UiObject clickDemoMe= myDevice.findObject((new UiSelector().textContains("Demo Me")));
            clickDemoMe.click();
            myDevice.pressDPadUp();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            myDevice.pressEnter();
            Thread.sleep(5000);
            myDevice.pressHome();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Reached here");
        UiObject appsButton =myDevice.findObject(new UiSelector().description("Apps"));
        try {
            appsButton.click();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            Thread.sleep(2000);
            myDevice.pressDPadDown();
            UiScrollable appViews= new UiScrollable(new UiSelector().scrollable(true));
            Thread.sleep(2000);
            appViews.setAsVerticalList();
        }
        catch(Exception e){

        }
        myDevice.pressHome();
        UiObject netflixButton = myDevice.findObject(new UiSelector().description("Netflix"));
        try {
            netflixButton.click();
            myDevice.pressDPadDown();
            Thread.sleep(5000);
            myDevice.pressDPadRight();
            Thread.sleep(3000);
            myDevice.pressDPadRight();
            Thread.sleep(3000);
            myDevice.pressDPadLeft();
            Thread.sleep(3000);
            myDevice.pressDPadLeft();
            Thread.sleep(3000);
            myDevice.pressEnter();
            myDevice.pressKeyCode(KeyEvent.KEYCODE_MEDIA_PAUSE);

        }
        catch (Exception e){

        }


    }
}
