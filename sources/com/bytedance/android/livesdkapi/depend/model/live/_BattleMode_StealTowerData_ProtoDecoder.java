package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C9358b.C9359a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleMode_StealTowerData_ProtoDecoder implements C2265b<C9359a> {
    public final C9359a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9359a decodeStatic(C2272g gVar) throws Exception {
        C9359a aVar = new C9359a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                aVar.f25642i = (int) C2273h.m9785c(gVar);
            }
        }
    }
}
