package com.p280ss.mediakit.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.mediakit.net.NetUtils */
public class NetUtils {
    public static NetworkInfo getNetworkInfo(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return null;
            }
            return networkInfo.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return -1;
            }
            return networkInfo.getType();
        } catch (Throwable unused) {
            return -1;
        }
    }
}
