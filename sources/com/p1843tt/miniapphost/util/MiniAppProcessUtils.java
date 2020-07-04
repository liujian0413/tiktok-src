package com.p1843tt.miniapphost.util;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.p1843tt.miniapphost.AppBrandLogger;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tt.miniapphost.util.MiniAppProcessUtils */
public class MiniAppProcessUtils {
    private static volatile boolean mCheckedMiniAppProcessExist;
    private static String sCurProcessName;

    public static boolean isMiniAppProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null || !curProcessName.contains(":miniapp")) {
            return false;
        }
        return true;
    }

    public static String getCurProcessName(Context context) {
        try {
            String str = sCurProcessName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && context != null && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static void killCurrentProcess(Context context) {
        if (isMiniAppProcess(context)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                AppBrandLogger.m146383e("MiniAppProcessUtils", e);
            }
            if (VERSION.SDK_INT >= 21) {
                killCurrentAppTask(context);
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    public static boolean checkMiniAppProcessExistInMainProcess(Context context) {
        boolean z;
        if (mCheckedMiniAppProcessExist) {
            return false;
        }
        mCheckedMiniAppProcessExist = true;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((RunningAppProcessInfo) it.next()).processName.contains(":miniapp")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m146383e("MiniAppProcessUtils", e);
        }
        z = false;
        AppBrandLogger.m146384i("MiniAppProcessUtils", "checkMiniAppProcessExistInMainProcess hasMiniAppProcessExist:", Boolean.valueOf(z), "duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    public static void killCurrentAppTask(Context context) {
        try {
            String curProcessName = getCurProcessName(context);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                List<AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks != null && appTasks.size() > 0) {
                    for (AppTask appTask : appTasks) {
                        ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
                        if (component != null) {
                            String str = null;
                            int indexOf = curProcessName.indexOf(":");
                            if (indexOf >= 0) {
                                str = curProcessName.substring(indexOf + 1).replace("miniapp", "");
                            }
                            String className = component.getClassName();
                            AppBrandLogger.m146384i("MiniAppProcessUtils", "killCurrentAppTask processName", curProcessName, "miniAppProcessIndex", str, "componentClassName", className);
                            StringBuilder sb = new StringBuilder("MiniappTabActivity");
                            sb.append(str);
                            if (!className.endsWith(sb.toString())) {
                                StringBuilder sb2 = new StringBuilder("MiniappTabHostStackActivity");
                                sb2.append(str);
                                if (!className.endsWith(sb2.toString())) {
                                }
                            }
                            AppBrandLogger.m146384i("MiniAppProcessUtils", "finishAndRemoveMiniAppTask");
                            appTask.finishAndRemoveTask();
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m146383e("MiniAppProcessUtils", e);
        }
    }
}
