package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.feed.C2344a.C2345a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _FeedExtra_LogPb_ProtoDecoder implements C2265b<C2345a> {
    public final C2345a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2345a decodeStatic(C2272g gVar) throws Exception {
        C2345a aVar = new C2345a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                aVar.f7705a = C2273h.m9787e(gVar);
            }
        }
    }
}
