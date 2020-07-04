package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _AuthenticationInfo_ProtoDecoder implements C2265b<C2372d> {
    public final C2372d decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2372d decodeStatic(C2272g gVar) throws Exception {
        C2372d dVar = new C2372d();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f7809a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        dVar.f7810b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        dVar.f7811c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
