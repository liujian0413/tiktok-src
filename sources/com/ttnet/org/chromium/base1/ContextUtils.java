package com.ttnet.org.chromium.base1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class ContextUtils {
    private static Context sApplicationContext;

    static class Holder {
        public static SharedPreferences sSharedPreferences = ContextUtils.fetchAppSharedPreferences();

        private Holder() {
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    private static native void nativeInitNativeSideApplicationContext(Context context);

    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static void initApplicationContextForNative() {
        if (sApplicationContext != null) {
            nativeInitNativeSideApplicationContext(sApplicationContext);
            return;
        }
        throw new RuntimeException("Cannot have native global application context be null.");
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        Holder.sSharedPreferences = fetchAppSharedPreferences();
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (context != null) {
            sApplicationContext = context;
            return;
        }
        throw new RuntimeException("Global application context cannot be set to null.");
    }

    public static void initApplicationContext(Context context) {
        if (sApplicationContext == null || sApplicationContext == context) {
            initJavaSideApplicationContext(context);
            return;
        }
        throw new RuntimeException("Attempting to set multiple global application contexts.");
    }
}
