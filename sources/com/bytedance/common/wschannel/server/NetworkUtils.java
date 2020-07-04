package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public final class NetworkUtils {

    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: b */
    static int m29012b(Context context) {
        boolean c = m29013c(context);
        NetworkType a = m29011a(context);
        if (!c) {
            return 2;
        }
        if (NetworkType.WIFI == a) {
            return 3;
        }
        if (NetworkType.NONE != a) {
            return 4;
        }
        return 1;
    }

    /* renamed from: c */
    private static boolean m29013c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static NetworkType m29011a(Context context) {
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
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return NetworkType.MOBILE;
                    }
                    if (!(telephonyManager.getNetworkType() == 3 || telephonyManager.getNetworkType() == 5 || telephonyManager.getNetworkType() == 6 || telephonyManager.getNetworkType() == 8 || telephonyManager.getNetworkType() == 9 || telephonyManager.getNetworkType() == 10 || telephonyManager.getNetworkType() == 12 || telephonyManager.getNetworkType() == 14)) {
                        if (telephonyManager.getNetworkType() != 15) {
                            if (telephonyManager.getNetworkType() == 13) {
                                return NetworkType.MOBILE_4G;
                            }
                            return NetworkType.MOBILE;
                        }
                    }
                    return NetworkType.MOBILE_3G;
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
