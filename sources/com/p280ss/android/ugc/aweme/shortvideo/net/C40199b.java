package com.p280ss.android.ugc.aweme.shortvideo.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.net.b */
public final class C40199b {
    /* renamed from: a */
    public static boolean m128499a(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m128500b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getExtraInfo() == null) {
            return 4;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            if (activeNetworkInfo.getExtraInfo().toLowerCase(Locale.getDefault()).equals("cmnet")) {
                return 2;
            }
            return 3;
        } else if (type == 1) {
            return 1;
        } else {
            return 4;
        }
    }
}
