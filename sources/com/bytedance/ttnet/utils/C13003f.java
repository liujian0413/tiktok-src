package com.bytedance.ttnet.utils;

import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import com.bytedance.ttnet.C12924a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.f */
public final class C13003f {

    /* renamed from: a */
    private static C13004a f34435a = null;

    /* renamed from: b */
    private static volatile boolean f34436b = true;

    /* renamed from: com.bytedance.ttnet.utils.f$a */
    public interface C13004a {
        /* renamed from: a */
        void mo26438a(String str, String str2, int i, boolean z, JSONObject jSONObject);
    }

    /* renamed from: a */
    public static C13004a m37946a() {
        return f34435a;
    }

    /* renamed from: a */
    public static void m37948a(C13004a aVar) {
        f34435a = aVar;
    }

    /* renamed from: a */
    public static void m37950a(boolean z) {
        f34436b = z;
    }

    /* renamed from: a */
    public static String m37947a(String str) {
        if (!f34436b) {
            return null;
        }
        try {
            if (C10189i.m30260a(str).getHost().endsWith(C12924a.m37623b())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m37949a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
        C13004a aVar = f34435a;
        if (aVar != null) {
            aVar.mo26438a(str, str2, i, z, jSONObject);
        }
    }
}
