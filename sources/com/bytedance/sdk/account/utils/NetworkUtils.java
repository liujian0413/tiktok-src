package com.bytedance.sdk.account.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.sdk.account.C12789c;
import com.p280ss.android.account.C18895c;
import java.util.Map;

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

    /* renamed from: a */
    public static NetworkType m37578a(Context context) {
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

    /* renamed from: a */
    public static String m37579a(int i, String str) throws Exception {
        C12789c c = C18895c.m61668a().mo50931c();
        if (c != null) {
            return c.mo31339a(Integer.MAX_VALUE, str);
        }
        return null;
    }

    /* renamed from: a */
    public static String m37580a(int i, String str, Map<String, String> map) throws Exception {
        C12789c c = C18895c.m61668a().mo50931c();
        if (c != null) {
            return c.mo31340a(Integer.MAX_VALUE, str, map);
        }
        return null;
    }
}
