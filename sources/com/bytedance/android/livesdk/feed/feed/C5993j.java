package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.feed.feed.j */
public final class C5993j implements C2265b<C5990g> {
    /* renamed from: b */
    private static C5990g m18733b(C2272g gVar) throws Exception {
        return m18732a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m18733b(gVar);
    }

    /* renamed from: a */
    private static C5990g m18732a(C2272g gVar) throws Exception {
        C5990g gVar2 = new C5990g();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return gVar2;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                gVar2.f17763a = C2273h.m9787e(gVar);
            }
        }
    }
}
