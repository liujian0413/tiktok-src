package com.bytedance.android.p109c.p110a.p111a;

import com.C1642a;
import java.io.IOException;

/* renamed from: com.bytedance.android.c.a.a.h */
public final class C2273h {
    /* renamed from: b */
    public static int m9784b(C2272g gVar) throws IOException {
        return gVar.mo8062e();
    }

    /* renamed from: c */
    public static long m9785c(C2272g gVar) throws IOException {
        return gVar.mo8063f();
    }

    /* renamed from: e */
    public static String m9787e(C2272g gVar) throws IOException {
        return gVar.mo8061d();
    }

    /* renamed from: f */
    public static byte[] m9788f(C2272g gVar) throws IOException {
        return gVar.mo8060c();
    }

    /* renamed from: d */
    public static double m9786d(C2272g gVar) throws IOException {
        return Double.longBitsToDouble(gVar.mo8065h());
    }

    /* renamed from: a */
    public static boolean m9783a(C2272g gVar) throws IOException {
        int e = gVar.mo8062e();
        if (e == 0) {
            return false;
        }
        if (e == 1) {
            return true;
        }
        throw new IOException(C1642a.m8034a("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(e)}));
    }

    /* renamed from: g */
    public static void m9789g(C2272g gVar) throws IOException {
        int i = gVar.f7547a;
        if (i != 5) {
            switch (i) {
                case 0:
                    gVar.mo8063f();
                    return;
                case 1:
                    gVar.mo8065h();
                    return;
                case 2:
                    gVar.mo8060c();
                    return;
                default:
                    throw new IllegalStateException("Unexpected field encoding found!");
            }
        } else {
            gVar.mo8064g();
        }
    }
}
