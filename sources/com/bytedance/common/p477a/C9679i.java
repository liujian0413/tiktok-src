package com.bytedance.common.p477a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.common.a.i */
final class C9679i {

    /* renamed from: a */
    private static Pattern f26414a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: a */
    static boolean m28598a(Context context) {
        int b = m28600b(context);
        if (b == 1 || b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static int m28600b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Throwable unused) {
            return -2;
        }
    }

    /* renamed from: a */
    static boolean m28599a(String str) {
        if (str == null) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        for (char c : charArray) {
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && ((c < '0' || c > '9') && c != '.' && c != '-'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static String m28602c(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("failed to get BSSID: ");
            sb.append(th);
            C9676f.m28592a(sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    static boolean m28601b(String str) {
        if (str != null) {
            try {
                if (str.length() < 7 || str.length() > 15 || str.equals("") || !f26414a.matcher(str).matches()) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                try {
                    int indexOf = str.indexOf(46);
                    if (!(indexOf == -1 || str.charAt(0) == '-')) {
                        if (Integer.parseInt(str.substring(0, indexOf)) <= 255) {
                            int i = indexOf + 1;
                            int indexOf2 = str.indexOf(46, i);
                            if (!(indexOf2 == -1 || str.charAt(i) == '-')) {
                                if (Integer.parseInt(str.substring(i, indexOf2)) <= 255) {
                                    int i2 = indexOf2 + 1;
                                    int indexOf3 = str.indexOf(46, i2);
                                    if (!(indexOf3 == -1 || str.charAt(i2) == '-' || Integer.parseInt(str.substring(i2, indexOf3)) > 255)) {
                                        int i3 = indexOf3 + 1;
                                        if (str.charAt(i3) == '-' || Integer.parseInt(str.substring(i3, str.length())) > 255 || str.charAt(str.length() - 1) == '.') {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            }
        }
        return false;
    }
}
