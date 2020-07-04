package com.p280ss.android.p817ad.splash.p836g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.taobao.android.dexposed.ClassUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* renamed from: com.ss.android.ad.splash.g.g */
public final class C19128g {
    /* renamed from: a */
    private static String m62686a(int i) {
        String str = "";
        if (i == 4) {
            return "3g";
        }
        if (i == 8) {
            return "2g";
        }
        if (i == 16) {
            return "mobile";
        }
        switch (i) {
            case 1:
                return "wifi";
            case 2:
                return "4g";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static String m62685a() {
        Context J = C19025f.m62096J();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) J.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 0) {
                try {
                    Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    if (networkInterfaces != null) {
                        while (networkInterfaces.hasMoreElements()) {
                            Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                            if (inetAddresses != null) {
                                while (inetAddresses.hasMoreElements()) {
                                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                                    if ((inetAddress instanceof Inet4Address) && !inetAddress.isLoopbackAddress()) {
                                        return inetAddress.getHostAddress();
                                    }
                                }
                                continue;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (activeNetworkInfo.getType() == 1) {
                return m62688b(((WifiManager) J.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m62692e(Context context) {
        return m62686a(m62691d(context));
    }

    /* renamed from: b */
    public static boolean m62689b(Context context) {
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

    /* renamed from: c */
    public static boolean m62690c(Context context) {
        if (m62689b(context) && m62691d(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m62688b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 8) & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 16) & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 24) & NormalGiftView.ALPHA_255);
        return sb.toString();
    }

    /* renamed from: d */
    public static int m62691d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return 1;
                    }
                    if (type != 0) {
                        return 16;
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
                            return 4;
                        case 13:
                            return 2;
                        default:
                            return 16;
                    }
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 16;
        }
    }

    /* renamed from: a */
    public static boolean m62687a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
            if (allNetworkInfo != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == State.CONNECTED || networkInfo.getState() == State.CONNECTING) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
