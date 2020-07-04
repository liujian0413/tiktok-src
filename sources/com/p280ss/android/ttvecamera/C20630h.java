package com.p280ss.android.ttvecamera;

/* renamed from: com.ss.android.ttvecamera.h */
public final class C20630h {

    /* renamed from: a */
    private static C20631a f55716a;

    /* renamed from: com.ss.android.ttvecamera.h$a */
    public interface C20631a {
        /* renamed from: a */
        void mo55808a(String str, double d);

        /* renamed from: a */
        void mo55809a(String str, long j);

        /* renamed from: a */
        void mo55810a(String str, String str2);
    }

    /* renamed from: a */
    public static void m68388a(C20631a aVar) {
        f55716a = aVar;
    }

    /* renamed from: a */
    public static void m68389a(String str, double d) {
        if (f55716a != null) {
            f55716a.mo55808a(str, d);
        }
    }

    /* renamed from: a */
    public static void m68390a(String str, long j) {
        if (f55716a != null) {
            f55716a.mo55809a(str, j);
        }
    }

    /* renamed from: a */
    public static void m68391a(String str, String str2) {
        if (f55716a != null) {
            f55716a.mo55810a(str, str2);
        }
    }
}
