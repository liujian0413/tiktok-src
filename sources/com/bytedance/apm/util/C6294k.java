package com.bytedance.apm.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.p022v4.content.C0683b;
import android.telephony.TelephonyManager;
import com.bytedance.apm.C6174c;
import com.bytedance.common.utility.NetworkUtils.C6301a;
import com.bytedance.common.utility.NetworkUtils.NetworkType;

/* renamed from: com.bytedance.apm.util.k */
public final class C6294k {

    /* renamed from: a */
    private static C6301a f18532a;

    /* renamed from: b */
    private static NetworkType f18533b = NetworkType.UNKNOWN;

    /* renamed from: b */
    public static boolean m19530b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m19529a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (C0683b.m2909b(C6174c.m19129a(), "android.permission.ACCESS_NETWORK_STATE") == 0) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                if (networkInfo.isAvailable()) {
                    if (networkInfo.getType() == 0) {
                        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    }
                    return -10000;
                }
            }
            return -10000;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static boolean m19532d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (f18532a == null || f18532a.mo15136a() == NetworkType.NONE) {
                        if (1 == activeNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    } else if (f18532a.mo15136a() == NetworkType.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static NetworkType m19531c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
