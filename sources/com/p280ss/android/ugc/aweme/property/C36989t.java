package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;

/* renamed from: com.ss.android.ugc.aweme.property.t */
public final class C36989t {
    /* renamed from: f */
    public static C36930a m118998f(C36952a aVar) {
        if (aVar instanceof Property) {
            return ((Property) aVar).getUpdateCallback();
        }
        return null;
    }

    /* renamed from: g */
    public static <T extends Comparable<T>> C36990u<T> m118999g(C36952a aVar) {
        if (aVar instanceof Property) {
            return ((Property) aVar).valueRange();
        }
        return null;
    }

    /* renamed from: b */
    public static float m118994b(C36952a aVar) {
        if (aVar instanceof Property) {
            return C35563c.f93231M.mo93308d((Property) aVar);
        }
        if (aVar instanceof AVSettings.Property) {
            return C35563c.f93230L.mo93345d((AVSettings.Property) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property or AVSettings.Property.");
    }

    /* renamed from: c */
    public static int m118995c(C36952a aVar) {
        if (aVar instanceof Property) {
            return C35563c.f93231M.mo93306b((Property) aVar);
        }
        if (aVar instanceof AVSettings.Property) {
            return C35563c.f93230L.mo93343b((AVSettings.Property) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property or AVSettings.Property.");
    }

    /* renamed from: d */
    public static long m118996d(C36952a aVar) {
        if (aVar instanceof Property) {
            return C35563c.f93231M.mo93307c((Property) aVar);
        }
        if (aVar instanceof AVSettings.Property) {
            return C35563c.f93230L.mo93344c((AVSettings.Property) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property or AVSettings.Property.");
    }

    /* renamed from: e */
    public static String m118997e(C36952a aVar) {
        if (aVar instanceof Property) {
            return C35563c.f93231M.mo93309e((Property) aVar);
        }
        if (aVar instanceof AVSettings.Property) {
            return C35563c.f93230L.mo93346e((AVSettings.Property) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property or AVSettings.Property.");
    }

    /* renamed from: a */
    public static boolean m118993a(C36952a aVar) {
        if (aVar instanceof Property) {
            return C35563c.f93231M.mo93305a((Property) aVar);
        }
        if (aVar instanceof AVSettings.Property) {
            return C35563c.f93230L.mo93342a((AVSettings.Property) aVar);
        }
        throw new RuntimeException("property must be AVAB.Property or AVSettings.Property.");
    }

    /* renamed from: a */
    public static void m118988a(C36952a aVar, float f) {
        if (aVar instanceof Property) {
            C35563c.f93231M.mo93300a((Property) aVar, f);
            return;
        }
        if (aVar instanceof AVSettings.Property) {
            C35563c.f93230L.mo93337a((AVSettings.Property) aVar, f);
        }
    }

    /* renamed from: a */
    public static void m118989a(C36952a aVar, int i) {
        if (aVar instanceof Property) {
            C35563c.f93231M.mo93301a((Property) aVar, i);
            return;
        }
        if (aVar instanceof AVSettings.Property) {
            C35563c.f93230L.mo93338a((AVSettings.Property) aVar, i);
        }
    }

    /* renamed from: a */
    public static void m118990a(C36952a aVar, long j) {
        if (aVar instanceof Property) {
            C35563c.f93231M.mo93302a((Property) aVar, j);
            return;
        }
        if (aVar instanceof AVSettings.Property) {
            C35563c.f93230L.mo93339a((AVSettings.Property) aVar, j);
        }
    }

    /* renamed from: a */
    public static void m118991a(C36952a aVar, String str) {
        if (aVar instanceof Property) {
            C35563c.f93231M.mo93303a((Property) aVar, str);
            return;
        }
        if (aVar instanceof AVSettings.Property) {
            C35563c.f93230L.mo93340a((AVSettings.Property) aVar, str);
        }
    }

    /* renamed from: a */
    public static void m118992a(C36952a aVar, boolean z) {
        if (aVar instanceof Property) {
            C35563c.f93231M.mo93304a((Property) aVar, z);
            return;
        }
        if (aVar instanceof AVSettings.Property) {
            C35563c.f93230L.mo93341a((AVSettings.Property) aVar, z);
        }
    }
}
