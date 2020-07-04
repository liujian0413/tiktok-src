package com.ttnet.org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p327a.C32273a;
import java.io.File;

public final class CommandLineInitUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

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

    public static void initCommandLine(String str) {
        initCommandLine(str, null);
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

    private static boolean shouldUseDebugCommandLine(Supplier<Boolean> supplier) {
        String str;
        if (supplier != null && ((Boolean) supplier.get()).booleanValue()) {
            return true;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        if (VERSION.SDK_INT < 17) {
            str = getDebugAppPreJBMR1(applicationContext);
        } else {
            str = getDebugAppJBMR1(applicationContext);
        }
        if (applicationContext.getPackageName().equals(str) || BuildInfo.isDebugAndroid()) {
            return true;
        }
        return false;
    }

    public static void initCommandLine(String str, Supplier<Boolean> supplier) {
        File file = new File("/data/local/tmp", str);
        if (!file.exists() || !shouldUseDebugCommandLine(supplier)) {
            file = new File("/data/local", str);
        }
        CommandLine.initFromFile(file.getPath());
    }
}
