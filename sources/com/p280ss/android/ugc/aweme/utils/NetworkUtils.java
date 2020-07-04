package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.NetworkUtils */
public final class NetworkUtils {

    /* renamed from: a */
    public static final NetworkUtils f111420a = new NetworkUtils();

    /* renamed from: com.ss.android.ugc.aweme.utils.NetworkUtils$NetworkType */
    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private NetworkType(int i) {
            this.value = i;
        }
    }

    private NetworkUtils() {
    }

    /* renamed from: d */
    public static final boolean m136227d(Context context) {
        C7573i.m23587b(context, "context");
        NetworkType b = m136225b(context);
        if (NetworkType.MOBILE_2G == b || NetworkType.MOBILE_3G == b || NetworkType.MOBILE_4G == b || NetworkType.MOBILE == b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m136224a(Context context) {
        C7573i.m23587b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    return false;
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m136226c(Context context) {
        C7573i.m23587b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isAvailable()) {
                        if (1 == activeNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final NetworkType m136225b(Context context) {
        C7573i.m23587b(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isAvailable()) {
                        int type = activeNetworkInfo.getType();
                        if (1 == type) {
                            return NetworkType.WIFI;
                        }
                        if (type != 0) {
                            return NetworkType.MOBILE;
                        }
                        Object systemService2 = context.getSystemService("phone");
                        if (systemService2 != null) {
                            switch (((TelephonyManager) systemService2).getNetworkType()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    return NetworkType.MOBILE_2G;
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
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                        }
                    }
                }
                return NetworkType.NONE;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
