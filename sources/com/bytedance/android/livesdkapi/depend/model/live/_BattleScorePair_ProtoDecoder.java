package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleScorePair_ProtoDecoder implements C2265b<C9360c> {
    public final C9360c decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9360c decodeStatic(C2272g gVar) throws Exception {
        C9360c cVar = new C9360c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f25645b = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        cVar.f25644a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        cVar.f25647d = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cVar;
            }
        }
    }
}
