package com.example.myapplication;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.assertTrue;


@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)
public class HomeTest {

    @Test
    public void setUp(){
        UiDevice myDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        try {
            myDevice.pressHome();
            assertTrue(myDevice.pressKeyCode(KeyEvent.KEYCODE_TV_INPUT_HDMI_1));
            Thread.sleep(1000);
            myDevice.pressDPadUp();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
            myDevice.pressEnter();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadDown();
            Thread.sleep(1000);
            myDevice.pressDPadRight();
            Thread.sleep(1000);
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
            myDevice.pressKeyCode(KeyEvent.KEYCODE_CHANNEL_UP);
            Thread.sleep(3000);
            //Launch of Google Assistance
            myDevice.pressSearch();
            Thread.sleep(2000);
            myDevice.pressHome();
            Thread.sleep(2000);
            myDevice.pressKeyCode(KeyEvent.KEYCODE_TV);

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

        }
        catch (Exception e){

        }


    }


}


