package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BorderInfo_ProtoDecoder implements C2265b<C2374f> {
    public final C2374f decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2374f decodeStatic(C2272g gVar) throws Exception {
        C2374f fVar = new C2374f();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f7818a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        fVar.f7819b = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fVar;
            }
        }
    }
}
