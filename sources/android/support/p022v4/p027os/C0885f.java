package android.support.p022v4.p027os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.f */
public final class C0885f {
    /* renamed from: a */
    public static void m3752a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m3753a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
