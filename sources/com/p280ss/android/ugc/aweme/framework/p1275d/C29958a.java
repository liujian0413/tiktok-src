package com.p280ss.android.ugc.aweme.framework.p1275d;

import android.content.Context;
import com.p280ss.android.ugc.aweme.utils.NetworkUtils;
import com.p280ss.android.ugc.aweme.utils.NetworkUtils.NetworkType;

/* renamed from: com.ss.android.ugc.aweme.framework.d.a */
public final class C29958a {

    /* renamed from: a */
    private static NetworkType f78752a;

    /* renamed from: a */
    public static void m98224a(NetworkType networkType) {
        if (f78752a != null) {
            f78752a = networkType;
        }
    }

    /* renamed from: a */
    public static boolean m98225a(Context context) {
        if (f78752a == null || f78752a == NetworkType.NONE) {
            f78752a = NetworkUtils.m136225b(context);
        }
        if (f78752a == NetworkType.WIFI) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m98226b(Context context) {
        NetworkType c = m98227c(context);
        if (NetworkType.MOBILE_2G == c || NetworkType.MOBILE_3G == c || NetworkType.MOBILE_4G == c || NetworkType.MOBILE == c) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static NetworkType m98227c(Context context) {
        if (f78752a == null || f78752a == NetworkType.NONE) {
            return NetworkUtils.m136225b(context);
        }
        return f78752a;
    }
}
