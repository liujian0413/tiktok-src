package com.p280ss.videoarch.liveplayer.p1835b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.videoarch.liveplayer.b.d */
public final class C46297d {
    /* renamed from: a */
    public static NetworkInfo m145338a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
