package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Process;
import android.preference.PreferenceManager;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Context sApplicationContext;
    private static String sProcessName;

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

    public static SharedPreferences fetchAppSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static AssetManager getApplicationAssets() {
        Context applicationContext = getApplicationContext();
        while (applicationContext instanceof ContextWrapper) {
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static boolean isIsolatedProcess() {
        try {
            return ((Boolean) Process.class.getMethod("isIsolated", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProcessName() {
        if (sProcessName != null) {
            return sProcessName;
        }
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            String str = (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            sProcessName = str;
            return str;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        initJavaSideApplicationContext(context);
        Holder.sSharedPreferences = fetchAppSharedPreferences();
    }

    private static void initJavaSideApplicationContext(Context context) {
        if (BuildConfig.DCHECK_IS_ON && (context instanceof Application)) {
            context = new ContextWrapper(context);
        }
        sApplicationContext = context;
    }
}
