package com.ttnet.org.chromium.base1.multidex;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ChromiumMultiDexInstaller {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m22902x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public static void install(Context context) {
    }

    private static String getProcessName(Context context) {
        String str;
        try {
            int myPid = Process.myPid();
            Iterator it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
            return str;
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static boolean shouldInstallMultiDex(Context context) {
        try {
            Object invoke = Process.class.getMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null && (invoke instanceof Boolean) && ((Boolean) invoke).booleanValue()) {
                return false;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
        String processName = getProcessName(context);
        if (processName == null) {
            return true;
        }
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m22902x89c42dc8(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo != null) {
                if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData != null) {
                    Bundle bundle = com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData;
                    StringBuilder sb = new StringBuilder();
                    sb.append(processName);
                    sb.append(".ignore_multidex");
                    if (!bundle.getBoolean(sb.toString(), false)) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } catch (NameNotFoundException unused2) {
            return true;
        }
    }
}
