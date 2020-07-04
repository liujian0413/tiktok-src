package com.p280ss.ttvideoengine.p1813f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.ttvideoengine.f.h */
public final class C46102h {
    /* renamed from: b */
    public static boolean m144481b(Context context) {
        NetworkInfo a = m144480a(context);
        if (a == null || !a.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static NetworkInfo m144480a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
