package com.bytedance.android.p089a.p090a.p098h;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.android.p089a.p090a.C2219d;

/* renamed from: com.bytedance.android.a.a.h.a */
public final class C2230a {
    /* renamed from: a */
    public static boolean m9594a() {
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C2219d.m9560c().f7457b.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
