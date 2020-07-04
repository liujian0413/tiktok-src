package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.C46947d;
import com.twitter.sdk.android.core.models.C46952i;
import com.twitter.sdk.android.core.models.C46964s;

/* renamed from: com.twitter.sdk.android.core.internal.t */
public final class C46937t {
    /* renamed from: b */
    public static String m146807b(C46947d dVar) {
        return ((C46964s) dVar.f120382a.mo118088a("site")).f120496a;
    }

    /* renamed from: c */
    public static String m146808c(C46947d dVar) {
        return (String) dVar.f120382a.mo118088a("player_stream_url");
    }

    /* renamed from: d */
    public static C46952i m146809d(C46947d dVar) {
        return (C46952i) dVar.f120382a.mo118088a("player_image");
    }

    /* renamed from: a */
    public static boolean m146806a(C46947d dVar) {
        if (("player".equals(dVar.f120383b) || "vine".equals(dVar.f120383b)) && m146810e(dVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m146810e(C46947d dVar) {
        C46964s sVar = (C46964s) dVar.f120382a.mo118088a("site");
        if (sVar != null) {
            try {
                if (Long.parseLong(sVar.f120496a) == 586671909) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
