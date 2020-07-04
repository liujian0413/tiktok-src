package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RoomUserAttr_ProtoDecoder implements C2265b<C9382s> {
    public final C9382s decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9382s decodeStatic(C2272g gVar) throws Exception {
        C9382s sVar = new C9382s();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        sVar.f25772a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        sVar.f25773b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        sVar.f25774c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        sVar.f25775d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        sVar.f25776e = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return sVar;
            }
        }
    }
}
