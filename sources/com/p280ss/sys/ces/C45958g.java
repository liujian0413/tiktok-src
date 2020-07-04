package com.p280ss.sys.ces;

import android.content.Context;
import com.p280ss.p811a.p813b.C18889h;
import com.p280ss.sys.ces.p1804c.C45945c;
import com.p280ss.sys.ces.p1804c.C45950g;

/* renamed from: com.ss.sys.ces.g */
public final class C45958g {

    /* renamed from: a */
    public static int f117461a = 7200;

    /* renamed from: b */
    public static int f117462b = 1800;

    /* renamed from: c */
    public static int f117463c = 180;

    /* renamed from: d */
    public static int f117464d;

    /* renamed from: a */
    private static void m144124a(Context context) {
        if (C45939c.f117415b) {
            try {
                new C45950g(context, C45939c.m144087f()).mo111271a();
            } catch (Throwable unused) {
            }
        } else {
            new C45945c(context, C45939c.m144087f()).mo50246a(2, 2, null);
        }
    }

    /* renamed from: a */
    public static synchronized void m144125a(Context context, int i) {
        synchronized (C45958g.class) {
            int i2 = 0;
            C45939c.f117418l = false;
            while (i2 < 3) {
                m144124a(context);
                i2++;
                C18889h.m61656a((long) (i2 * 3000));
                if (C45939c.f117418l) {
                    C45951d.m144110a(f117461a);
                    C45951d.m144112b(f117462b);
                    C45951d.m144114c(f117463c);
                    return;
                }
                f117464d++;
            }
        }
    }
}
