package com.bytedance.framwork.core.p517a.p520c;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.framwork.core.a.c.d */
public final class C10216d {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C10215c> f27791a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C10214b> f27792b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C10215c m30327a(String str) {
        return (C10215c) f27791a.get(str);
    }

    /* renamed from: a */
    public static void m30328a(String str, C10214b bVar) {
        f27792b.put(str, bVar);
    }

    /* renamed from: a */
    public static void m30329a(String str, C10215c cVar) {
        f27791a.put(str, cVar);
    }

    /* renamed from: a */
    public static boolean m30330a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        C10214b bVar = (C10214b) f27792b.get(str);
        if (bVar.mo24926a()) {
            return false;
        }
        return bVar.mo24927a(str2);
    }
}
