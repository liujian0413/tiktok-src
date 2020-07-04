package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RoomTab_ProtoDecoder implements C2265b<C9381r> {
    public final C9381r decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9381r decodeStatic(C2272g gVar) throws Exception {
        C9381r rVar = new C9381r();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        rVar.f25769a = C2273h.m9784b(gVar);
                        break;
                    case 2:
                        rVar.f25770b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        rVar.f25771c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return rVar;
            }
        }
    }
}
