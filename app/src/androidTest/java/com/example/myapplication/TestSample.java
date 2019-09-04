package com.example.myapplication;

import android.content.Context;
import android.content.Intent;

import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.File;

@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)
public class TestSample {
    @Test
    public void setUp() {

        UiDevice myDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        myDevice.pressHome();

        Context context =InstrumentationRegistry.getInstrumentation().getContext();
        Intent intend=context.getPackageManager().getLaunchIntentForPackage("org.droidtv.playtv").addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intend);
        try {
            myDevice.pressKeyCode(166);
            Thread.sleep(5000);
            myDevice.pressKeyCode(167);
            Thread.sleep(5000);
            myDevice.pressKeyCode(167);
            Thread.sleep(4000);
            myDevice.pressKeyCode(167);
            Thread.sleep(4000);
            myDevice.pressKeyCode(166);
            Thread.sleep(3000);
            myDevice.pressHome();

        }catch(Exception e){

        }

        myDevice.pressHome();
        myDevice.takeScreenshot(new File("C:\\Users\\vinita.nair\\Pictures\\AndroidStudio\\image1.png"));
    }
}
