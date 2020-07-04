package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _PatternRef_ProtoDecoder implements C2265b<C9502d> {
    public final C9502d decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9502d decodeStatic(C2272g gVar) throws Exception {
        C9502d dVar = new C9502d();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f26004a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        dVar.f26005b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return dVar;
            }
        }
    }
}
