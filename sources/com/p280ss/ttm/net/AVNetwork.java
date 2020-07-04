package com.p280ss.ttm.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.ttm.net.AVNetwork */
public final class AVNetwork {
    public static final int getNetworkType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 1;
            }
            if (type == 0) {
                return 2;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
