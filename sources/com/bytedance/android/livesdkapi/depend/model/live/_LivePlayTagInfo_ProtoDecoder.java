package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _LivePlayTagInfo_ProtoDecoder implements C2265b<C9372l> {
    public final C9372l decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9372l decodeStatic(C2272g gVar) throws Exception {
        C9372l lVar = new C9372l();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 2:
                        lVar.f25717b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        lVar.f25718c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        lVar.f25719d = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return lVar;
            }
        }
    }
}
