package com.bytedance.common.utility;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

public final class NetworkUtils {

    /* renamed from: a */
    private static C6301a f18535a;

    /* renamed from: b */
    private static NetworkType f18536b = NetworkType.UNKNOWN;

    /* renamed from: c */
    private static boolean f18537c;

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final boolean is2G() {
            if (this == MOBILE || this == MOBILE_2G) {
                return true;
            }
            return false;
        }

        public final boolean isAvailable() {
            if (this == UNKNOWN || this == NONE) {
                return false;
            }
            return true;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.bytedance.common.utility.NetworkUtils$a */
    public interface C6301a {
        /* renamed from: a */
        NetworkType mo15136a();
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: a */
    private static boolean m19544a(int i) {
        return i > 4900 && i < 5900;
    }

    /* renamed from: a */
    static void m19542a(NetworkType networkType) {
        f18536b = networkType;
    }

    /* renamed from: a */
    public static void m19543a(C6301a aVar) {
        f18535a = aVar;
    }

    /* renamed from: f */
    public static String m19552f(Context context) {
        return m19547b(m19550d(context));
    }

    /* renamed from: c */
    public static NetworkType m19549c(Context context) {
        m19553g(context);
        if (f18536b == NetworkType.NONE) {
            f18536b = m19550d(context);
        }
        return f18536b;
    }

    /* renamed from: a */
    public static boolean m19545a(Context context) {
        NetworkType d = m19550d(context);
        if (d == NetworkType.MOBILE || d == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m19548b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (f18535a == null || f18535a.mo15136a() == NetworkType.NONE) {
                        if (1 == activeNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    } else if (f18535a.mo15136a() == NetworkType.WIFI) {
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

    /* renamed from: g */
    private static void m19553g(Context context) {
        if (f18535a == null || f18535a.mo15136a() == NetworkType.NONE) {
            m19554h(context);
            if (f18536b == NetworkType.UNKNOWN) {
                f18536b = m19550d(context);
            }
            return;
        }
        f18536b = f18535a.mo15136a();
    }

    /* renamed from: h */
    private static void m19554h(Context context) {
        if (!f18537c && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            context.getApplicationContext().registerReceiver(new NetworkConnectChangeReceiver(), intentFilter);
            f18537c = true;
        }
    }

    /* renamed from: b */
    public static String m19547b(NetworkType networkType) {
        String str = "";
        if (networkType == NetworkType.WIFI) {
            return "wifi";
        }
        if (networkType == NetworkType.WIFI_24GHZ) {
            return "wifi24ghz";
        }
        if (networkType == NetworkType.WIFI_5GHZ) {
            return "wifi5ghz";
        }
        if (networkType == NetworkType.MOBILE_2G) {
            return "2g";
        }
        if (networkType == NetworkType.MOBILE_3G) {
            return "3g";
        }
        if (networkType == NetworkType.MOBILE_3G_H) {
            return "3gh";
        }
        if (networkType == NetworkType.MOBILE_3G_HP) {
            return "3ghp";
        }
        if (networkType == NetworkType.MOBILE_4G) {
            return "4g";
        }
        if (networkType == NetworkType.MOBILE_5G) {
            return "5g";
        }
        if (networkType == NetworkType.MOBILE) {
            return "mobile";
        }
        return str;
    }

    /* renamed from: d */
    public static NetworkType m19550d(Context context) {
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
                    switch (telephonyManager.getNetworkType()) {
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
                            if (VERSION.SDK_INT < 28 || !m19546a(telephonyManager)) {
                                return NetworkType.MOBILE_4G;
                            }
                            return NetworkType.MOBILE_5G;
                        case 20:
                            return NetworkType.MOBILE_5G;
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

    /* renamed from: i */
    private static boolean m19555i(Context context) {
        int i;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (VERSION.SDK_INT >= 21) {
            i = connectionInfo.getFrequency();
        } else {
            String ssid = connectionInfo.getSSID();
            if (ssid != null && ssid.length() > 2) {
                String substring = ssid.substring(1, ssid.length() - 1);
                List scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Iterator it = scanResults.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ScanResult scanResult = (ScanResult) it.next();
                        if (scanResult.SSID.equals(substring)) {
                            i = scanResult.frequency;
                            break;
                        }
                    }
                }
            }
            i = 0;
        }
        return m19544a(i);
    }

    /* renamed from: a */
    private static boolean m19546a(TelephonyManager telephonyManager) {
        try {
            Object invoke = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getServiceState", new Class[0]).invoke(telephonyManager, new Object[0]);
            Method[] declaredMethods = Class.forName(invoke.getClass().getName()).getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (!method.getName().equals("getNrStatus")) {
                    if (!method.getName().equals("getNrState")) {
                        i++;
                    }
                }
                method.setAccessible(true);
                if (((Integer) method.invoke(invoke, new Object[0])).intValue() == 3) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: e */
    public static String m19551e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        if (m19555i(context)) {
                            return "wifi5g";
                        }
                        return "wifi";
                    } else if (type != 0) {
                        return "unknown";
                    } else {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        switch (telephonyManager.getNetworkType()) {
                            case 2:
                                return "edge";
                            case 3:
                                return "umts";
                            case 4:
                                return "cdma";
                            case 5:
                                return "evdo_0";
                            case 6:
                                return "evdo_a";
                            case 8:
                                return "hsdpa";
                            case 9:
                                return "hsupa";
                            case 10:
                                return "hspa";
                            case 12:
                                return "evdo_b";
                            case 13:
                                return "lte";
                            case 14:
                                return "ehrpd";
                            case 15:
                                return "hspap";
                            case 20:
                                return "nr";
                            default:
                                return String.valueOf(telephonyManager.getNetworkType());
                        }
                        return "unknown";
                    }
                }
            }
            return "none";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: a */
    private static String m19540a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m19541a(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String a = m19540a((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = m19540a(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
