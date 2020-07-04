package com.p280ss.android.socialbase.appdownloader.constants;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;

/* renamed from: com.ss.android.socialbase.appdownloader.constants.Constants */
public class Constants {
    public static final String DEFAULT_USER_AGENT;

    static {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(VERSION.RELEASE);
        boolean z3 = !TextUtils.isEmpty(Build.ID);
        if (!"REL".equals(VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) {
            z = false;
        }
        sb.append(AppDownloader.TAG);
        if (z2) {
            sb.append("/");
            sb.append(VERSION.RELEASE);
        }
        sb.append(" (Linux; U; Android");
        if (z2) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        if (z || z3) {
            sb.append(";");
            if (z) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z3) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        DEFAULT_USER_AGENT = sb.toString();
    }
}
