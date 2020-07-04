package com.p280ss.android.download;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.ss.android.download.a */
public final class C19357a {

    /* renamed from: a */
    public static final String f52375a;

    /* renamed from: b */
    public static final String f52376b;

    /* renamed from: c */
    public static final boolean f52377c;

    /* renamed from: d */
    public static final boolean f52378d;

    static {
        StringBuilder sb = new StringBuilder("/");
        sb.append(Environment.DIRECTORY_DOWNLOADS);
        f52375a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(VERSION.RELEASE);
        boolean z3 = !TextUtils.isEmpty(Build.ID);
        if (!"REL".equals(VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) {
            z = false;
        }
        sb2.append("SsAndroidDownloadManager");
        if (z2) {
            sb2.append("/");
            sb2.append(VERSION.RELEASE);
        }
        sb2.append(" (Linux; U; Android");
        if (z2) {
            sb2.append(" ");
            sb2.append(VERSION.RELEASE);
        }
        if (z || z3) {
            sb2.append(";");
            if (z) {
                sb2.append(" ");
                sb2.append(Build.MODEL);
            }
            if (z3) {
                sb2.append(" Build/");
                sb2.append(Build.ID);
            }
        }
        sb2.append(")");
        f52376b = sb2.toString();
        boolean isLoggable = Log.isLoggable("SsDownloadManager", 2);
        f52377c = isLoggable;
        f52378d = isLoggable;
    }
}
