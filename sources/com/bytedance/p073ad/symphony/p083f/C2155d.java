package com.bytedance.p073ad.symphony.p083f;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.p073ad.symphony.C2140e;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Locale;

/* renamed from: com.bytedance.ad.symphony.f.d */
public final class C2155d {
    /* renamed from: a */
    private static String m9390a() {
        if (VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            if (localeList != null && !localeList.isEmpty()) {
                return localeList.get(0).getCountry();
            }
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: b */
    private static String m9394b(Context context) {
        String str = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso();
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    private static StringBuilder m9393a(Context context) {
        StringBuilder sb = new StringBuilder(PreloadTask.BYTE_UNIT_NUMBER);
        String f = NetworkUtils.m19552f(context);
        sb.append("?device_platform=android");
        if (!C6319n.m19593a(f)) {
            sb.append("&ac=");
            sb.append(Uri.encode(f));
        }
        sb.append("&device_type=");
        sb.append(Uri.encode(Build.MODEL));
        sb.append("&os_version=");
        sb.append(VERSION.RELEASE);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        sb.append("&resolution=");
        sb.append(displayMetrics.heightPixels);
        sb.append("*");
        sb.append(displayMetrics.widthPixels);
        if (!C6319n.m19593a(m9394b(context))) {
            sb.append("&sim_region=");
            sb.append(Uri.encode(m9394b(context).toUpperCase()));
        }
        if (!C6319n.m19593a(m9390a())) {
            sb.append("&sys_region=");
            sb.append(Uri.encode(m9390a().toUpperCase()));
        }
        return sb;
    }

    /* renamed from: a */
    public static String m9391a(String str, Context context) {
        return m9392a(str, "/api/ad/v1/setting/", context);
    }

    /* renamed from: a */
    private static String m9392a(String str, String str2, Context context) {
        if (C6319n.m19593a(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        sb.append(m9393a(context));
        if (C2140e.m9356a() != null) {
            sb.append(C2140e.m9356a());
        }
        return sb.toString();
    }
}
