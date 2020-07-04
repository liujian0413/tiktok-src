package com.p280ss.android.agilelogger.utils;

import android.content.Context;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.agilelogger.utils.n */
public final class C19210n {
    /* renamed from: a */
    public static int m62946a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m62947a(String str) {
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        String str2 = "";
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
        }
        String[] split = str2.split("_");
        String str3 = "0";
        if (split.length > 0) {
            str3 = split[split.length - 1];
        }
        try {
            return Integer.parseInt(str3);
        } catch (Exception unused) {
            return 0;
        }
    }
}
