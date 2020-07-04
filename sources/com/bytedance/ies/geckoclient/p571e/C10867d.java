package com.bytedance.ies.geckoclient.p571e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.bytedance.ies.geckoclient.model.C10902c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.e.d */
public final class C10867d {
    /* renamed from: a */
    public static String m31880a() {
        return Build.BRAND;
    }

    /* renamed from: b */
    public static String m31883b() {
        return Locale.getDefault().getCountry();
    }

    /* renamed from: c */
    public static int m31885c(Context context) {
        try {
            return ((Integer) m31879a(context, "GECKO_VERSION_CODE")).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m31881a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo a = C10868e.m31886a(packageManager, context.getPackageName(), 0);
            if (a == null) {
                return "";
            }
            return a.loadLabel(packageManager).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m31884b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "unknow";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                    if (networkInfo != null) {
                        State state = networkInfo.getState();
                        if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                            return "WIFI";
                        }
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "unknow";
                    }
                }
            }
            return "unknow";
        } catch (Throwable unused) {
            return "unknow";
        }
    }

    /* renamed from: a */
    private static Object m31879a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return C10868e.m31886a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m31882a(Context context, C10902c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", m31881a(context));
        hashMap.put("aid", String.valueOf(cVar.f29505d));
        hashMap.put("ac", m31884b(context));
        hashMap.put("os_version", String.valueOf(VERSION.SDK_INT));
        hashMap.put("device_platform", "android");
        hashMap.put("device_type", Build.MODEL);
        hashMap.put("device_id", cVar.f29504c);
        return hashMap;
    }
}
