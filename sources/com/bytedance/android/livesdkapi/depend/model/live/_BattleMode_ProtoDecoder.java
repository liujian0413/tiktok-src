package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleMode_ProtoDecoder implements C2265b<C9358b> {
    public final C9358b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9358b decodeStatic(C2272g gVar) throws Exception {
        C9358b bVar = new C9358b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f25632a = C2273h.m9784b(gVar);
                        break;
                    case 2:
                        bVar.f25633b = _BattleMode_StealTowerData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
