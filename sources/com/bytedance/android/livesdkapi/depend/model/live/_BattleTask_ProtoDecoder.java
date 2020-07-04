package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleTask_ProtoDecoder implements C2265b<C9364g> {
    public final C9364g decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9364g decodeStatic(C2272g gVar) throws Exception {
        C9364g gVar2 = new C9364g();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return gVar2;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                gVar2.f25659a = C2273h.m9783a(gVar);
            }
        }
    }
}
