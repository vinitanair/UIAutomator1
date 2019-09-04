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
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    @Rule
     public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void setUp(){
        UiDevice myDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        myDevice.pressHome();
        myDevice.pressDPadUp();
        myDevice.pressDPadRight();
        myDevice.pressDPadRight();
        myDevice.pressDPadRight();
        myDevice.pressEnter();
        myDevice.pressDPadDown();
        myDevice.pressDPadDown();
        myDevice.pressDPadDown();
        myDevice.pressDPadDown();
        myDevice.pressDPadDown();
        myDevice.pressDPadDown();
        myDevice.pressDPadRight();
        myDevice.pressSearch();
        myDevice.pressBack();
        myDevice.pressDPadLeft();
        myDevice.pressHome();
        myDevice.pressKeyCode(KeyEvent.KEYCODE_TV_POWER);
        try {
            myDevice.wakeUp();
            myDevice.wakeUp();
        }catch(RemoteException e){
           e.printStackTrace();
        }

        myDevice.pressHome();
        myDevice.pressKeyCode(KeyEvent.KEYCODE_SETTINGS);
        try {
            Thread.sleep(4000);
        }catch(Exception e){

        }
        myDevice.pressKeyCode(KeyEvent.KEYCODE_TV_ANTENNA_CABLE);
        try {
            Thread.sleep(4000);
        }catch(Exception e){

        }
        myDevice.pressKeyCode(KeyEvent.KEYCODE_CHANNEL_UP);
        try {
            Thread.sleep(4000);
        }catch(Exception e){

        }
        myDevice.pressKeyCode(KeyEvent.KEYCODE_GUIDE);
        try {
            Thread.sleep(4000);
        }catch(Exception e){

        }
        myDevice.pressKeyCode(KeyEvent.KEYCODE_NUMPAD_4);
        try {
            Thread.sleep(4000);
        }catch(Exception e){

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
