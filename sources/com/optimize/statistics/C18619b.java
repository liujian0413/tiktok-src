package com.optimize.statistics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.framwork.core.monitor.C6379c;
import org.json.JSONObject;

/* renamed from: com.optimize.statistics.b */
public final class C18619b {

    /* renamed from: a */
    private static C18629f f50305a = null;

    /* renamed from: b */
    private static boolean f50306b = false;

    /* renamed from: c */
    private static boolean f50307c = false;

    /* renamed from: d */
    private static boolean f50308d = true;

    /* renamed from: e */
    private static Context f50309e;

    /* renamed from: b */
    static boolean m61080b() {
        return f50307c;
    }

    /* renamed from: c */
    public static boolean m61083c() {
        return f50308d;
    }

    /* renamed from: a */
    static boolean m61078a() {
        return f50306b;
    }

    /* renamed from: a */
    public static void m61074a(Context context) {
        f50309e = context;
    }

    /* renamed from: b */
    public static void m61079b(boolean z) {
        f50307c = true;
    }

    /* renamed from: c */
    public static void m61082c(boolean z) {
        f50308d = z;
    }

    /* renamed from: a */
    public static void m61075a(C18629f fVar) {
        f50305a = fVar;
    }

    /* renamed from: a */
    public static void m61076a(boolean z) {
        f50306b = false;
    }

    /* renamed from: b */
    private static boolean m61081b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    static void m61077a(boolean z, String str, JSONObject jSONObject) {
        if (!z) {
            if (f50309e != null && !m61081b(f50309e)) {
                return;
            }
            if (C6379c.m19829a("image_monitor_error_v2")) {
                C6379c.m19826a("image_monitor_error_v2", jSONObject);
            }
        }
        if (f50305a != null) {
            f50305a.mo29907a(z, str, jSONObject);
        }
    }
}
