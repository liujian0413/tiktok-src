package com.p280ss.caijing.globaliap.p1793e.p1794a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* renamed from: com.ss.caijing.globaliap.e.a.a */
public final class C45852a {

    /* renamed from: a */
    public static final byte[] f117267a = {52, 102, 65, 75, 74, 90, 97, 69, 109, 53, 88, 56, 66, 85, 89, 84, 70, 109, 53, 74, 102, 82, 55, 53, 109, 67, 100, 121, 48, 74, 71, 103, 77, 122, 111, 85, 102, 118, 98, 70, 117, 72, 119, 61};

    /* renamed from: d */
    private static Point m143899d(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: c */
    private static String m143898c(Context context) {
        String str = "未知应用";
        if (context == null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (packageManager != null && !TextUtils.isEmpty(context.getPackageName())) {
                ApplicationInfo a = C45853b.m143900a(packageManager, context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (a != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(a);
                    if (applicationLabel != null && !TextUtils.isEmpty(applicationLabel.toString())) {
                        str = applicationLabel.toString();
                    }
                }
            }
        } catch (Exception e) {
            C6497a.m20185b(e);
        }
        return str;
    }

    /* renamed from: a */
    public static String m143896a(Context context) {
        int i;
        StringBuilder sb = new StringBuilder("CJPay-3.3.0-Android");
        sb.append(VERSION.RELEASE);
        sb.append("-");
        sb.append(m143898c(context));
        sb.append("-");
        int i2 = 0;
        if (context == null) {
            i = 0;
        } else {
            i = m143899d(context).y;
        }
        sb.append(i);
        sb.append("_");
        if (context != null) {
            i2 = m143899d(context).x;
        }
        sb.append(i2);
        sb.append("_");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m143897b(Context context) {
        if (context == null) {
            return "";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 0) {
                try {
                    Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                        while (true) {
                            if (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                                    return inetAddress.getHostAddress();
                                }
                            }
                        }
                    }
                } catch (SocketException e) {
                    C6497a.m20185b(e);
                }
            } else if (activeNetworkInfo.getType() == 1) {
                int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
                StringBuilder sb = new StringBuilder();
                sb.append(ipAddress & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 8) & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 16) & NormalGiftView.ALPHA_255);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                sb.append((ipAddress >> 24) & NormalGiftView.ALPHA_255);
                return sb.toString();
            }
        }
        return "";
    }
}
