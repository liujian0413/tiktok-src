package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _Author_ProtoDecoder implements C2265b<C2373e> {
    public final C2373e decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2373e decodeStatic(C2272g gVar) throws Exception {
        C2373e eVar = new C2373e();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f7812a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        eVar.f7813b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        eVar.f7815d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        eVar.f7816e = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        eVar.f7817f = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return eVar;
            }
        }
    }
}
