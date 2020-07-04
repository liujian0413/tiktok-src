package com.bytedance.android.live.base.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _Category_ProtoDecoder implements C2265b<C2340c> {
    public final C2340c decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2340c decodeStatic(C2272g gVar) throws Exception {
        C2340c cVar = new C2340c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f7684a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        cVar.f7685b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cVar.f7686c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        cVar.f7687d = C2273h.m9787e(gVar);
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
