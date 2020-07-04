package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C14923b;

/* renamed from: com.google.android.gms.internal.measurement.bh */
public final class C16415bh {

    /* renamed from: a */
    private static volatile C14923b f45961a = new C16399as();

    /* renamed from: a */
    public static void m53481a(String str, Object obj) {
        C16416bi b = C16416bi.m53484b();
        if (b != null) {
            b.mo43201e(str, obj);
            return;
        }
        if (m53482a(3) && obj != null) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(":");
            sb.append(valueOf);
        }
    }

    /* renamed from: a */
    private static boolean m53482a(int i) {
        if (f45961a == null || f45961a.mo37982a() > 3) {
            return false;
        }
        return true;
    }
}
