package com.p280ss.android.ugc.aweme.translation;

import android.support.p022v4.util.C0894f;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42621d;

/* renamed from: com.ss.android.ugc.aweme.translation.a */
public class C42616a {

    /* renamed from: a */
    private static volatile C42616a f110766a;

    /* renamed from: b */
    private C0894f<String, C42621d> f110767b = new C0894f<>(100);

    private C42616a() {
    }

    /* renamed from: a */
    public static C42616a m135409a() {
        if (f110766a == null) {
            synchronized (C42616a.class) {
                if (f110766a == null) {
                    f110766a = new C42616a();
                }
            }
        }
        return f110766a;
    }

    /* renamed from: a */
    public final C42621d mo104210a(String str) {
        if (str == null) {
            return null;
        }
        return (C42621d) this.f110767b.mo3341a(str);
    }

    /* renamed from: a */
    public final void mo104211a(String str, C42621d dVar) {
        if (str != null) {
            this.f110767b.mo3342a(str, dVar);
        }
    }
}
