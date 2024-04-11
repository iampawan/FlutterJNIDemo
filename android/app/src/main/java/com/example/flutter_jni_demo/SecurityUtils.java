package com.example.flutter_jni_demo;

import android.app.Activity;
import android.view.WindowManager;
import androidx.annotation.Keep;

@Keep
public abstract class SecurityUtils {
    // Hide constructor
    private SecurityUtils() {}

    public static void setSecurity(Activity mainActivity, boolean isVisible) {
        if(isVisible) {
            mainActivity.runOnUiThread(() ->  mainActivity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE));
        } else {
            mainActivity.runOnUiThread(() ->  mainActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE));
        }
    }
}
