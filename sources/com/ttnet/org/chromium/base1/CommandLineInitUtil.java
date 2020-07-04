package com.ttnet.org.chromium.base1;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p327a.C32273a;
import java.io.File;

public final class CommandLineInitUtil {

    class _lancet {
        private _lancet() {
        }

        static String com_ss_android_ugc_aweme_lancet_lanch_AndroidIdLancet_getString(ContentResolver contentResolver, String str) {
            if (!TextUtils.equals(str, "android_id")) {
                return System.getString(contentResolver, str);
            }
            if (TextUtils.isEmpty(C32273a.f84338a)) {
                C32273a.f84338a = System.getString(contentResolver, str);
            }
            return C32273a.f84338a;
        }
    }

    private CommandLineInitUtil() {
    }

    private static String getDebugAppJBMR1(Context context) {
        boolean z = true;
        if (Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 1) {
            z = false;
        }
        if (z) {
            return Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    private static String getDebugAppPreJBMR1(Context context) {
        boolean z = true;
        if (System.getInt(context.getContentResolver(), "adb_enabled", 0) != 1) {
            z = false;
        }
        if (z) {
            return _lancet.com_ss_android_ugc_aweme_lancet_lanch_AndroidIdLancet_getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    public static void initCommandLine(Context context, String str) {
        if (!CommandLine.isInitialized()) {
            File alternativeCommandLinePath = getAlternativeCommandLinePath(context, str);
            if (alternativeCommandLinePath != null) {
                StringBuilder sb = new StringBuilder("Using alternative command line file in ");
                sb.append(alternativeCommandLinePath.getPath());
                Log.m22892i("CommandLineInitUtil", sb.toString(), new Object[0]);
            } else {
                alternativeCommandLinePath = new File("/data/local", str);
            }
            CommandLine.initFromFile(alternativeCommandLinePath.getPath());
        }
    }

    private static File getAlternativeCommandLinePath(Context context, String str) {
        String str2;
        File file = new File("/data/local/tmp", str);
        if (!file.exists()) {
            return null;
        }
        try {
            if (!"eng".equals(Build.TYPE)) {
                if (!"userdebug".equals(Build.TYPE)) {
                    if (VERSION.SDK_INT < 17) {
                        str2 = getDebugAppPreJBMR1(context);
                    } else {
                        str2 = getDebugAppJBMR1(context);
                    }
                    if (str2 == null || !str2.equals(context.getApplicationContext().getPackageName())) {
                        return null;
                    }
                    return file;
                }
            }
            return file;
        } catch (RuntimeException unused) {
            Log.m22891e("CommandLineInitUtil", "Unable to detect alternative command line file", new Object[0]);
        }
    }
}
