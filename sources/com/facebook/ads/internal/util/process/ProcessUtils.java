package com.facebook.ads.internal.util.process;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.lang.reflect.Field;

public final class ProcessUtils {
    public static boolean sCurrentProcessCheckCalled;
    private static String sProcessName;
    public static boolean sRemoteProcess;

    private ProcessUtils() {
    }

    private static String getProcessNameAPI28() {
        try {
            return (String) Application.class.getMethod("getProcessName", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessName(Context context) {
        if (sProcessName != null) {
            return sProcessName;
        }
        if (VERSION.SDK_INT >= 28) {
            return getProcessNameAPI28();
        }
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            return null;
        }
        String processNameViaReflection = getProcessNameViaReflection((Application) applicationContext);
        sProcessName = processNameViaReflection;
        return processNameViaReflection;
    }

    private static String getProcessNameViaReflection(Application application) {
        try {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessSpecificName(String str, Context context) {
        String packageName = context.getPackageName();
        String processName = getProcessName(context);
        if (TextUtils.isEmpty(processName) || packageName.equals(processName)) {
            return str;
        }
        if (processName.contains(":")) {
            processName = processName.split(":")[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(processName);
        return sb.toString();
    }
}
