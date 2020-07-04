package com.ixigua.downloader.p797a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ixigua.downloader.a.d */
public final class C18466d {
    /* renamed from: a */
    public static boolean m60823a(int i) {
        return i == 0 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* renamed from: b */
    public static boolean m60824b(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public static int m60822a(Context context) {
        if (context == null) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m60825b(Context context) {
        if (context == null) {
            return false;
        }
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
    public static boolean m60826c(Context context) {
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return m60823a(activeNetworkInfo.getType());
            }
        }
        return false;
    }
}
