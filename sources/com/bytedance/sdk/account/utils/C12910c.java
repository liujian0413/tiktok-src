package com.bytedance.sdk.account.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.sdk.account.C12789c;
import com.p280ss.android.account.C18895c;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.bytedance.sdk.account.utils.c */
public final class C12910c {
    /* renamed from: a */
    private static boolean m37583a(Context context) {
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

    /* renamed from: a */
    public static int m37582a(Context context, Throwable th) {
        int i;
        C12789c c = C18895c.m61668a().mo50931c();
        if (c != null) {
            int a = c.mo31338a(context, th);
            if (a < 0) {
                return a;
            }
        }
        if (th instanceof ConnectTimeoutException) {
            i = -13;
        } else if (th instanceof SocketTimeoutException) {
            i = -14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i = -21;
                } else if (!(th instanceof IOException)) {
                    i = -18;
                }
            }
            i = -15;
        }
        if (context != null && ((i == -15 || i == -14) && !m37583a(context))) {
            i = -12;
        }
        return i;
    }
}
