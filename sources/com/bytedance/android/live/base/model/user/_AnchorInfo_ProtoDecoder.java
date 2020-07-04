package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _AnchorInfo_ProtoDecoder implements C2265b<C2370b> {
    public final C2370b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2370b decodeStatic(C2272g gVar) throws Exception {
        C2370b bVar = new C2370b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return bVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                bVar.f7794a = C2273h.m9785c(gVar);
            }
        }
    }
}
