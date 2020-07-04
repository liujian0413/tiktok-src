package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _UserAttr_ProtoDecoder implements C2265b<C2378j> {
    public final C2378j decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2378j decodeStatic(C2272g gVar) throws Exception {
        C2378j jVar = new C2378j();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        jVar.f7829a = C2273h.m9783a(gVar);
                        break;
                    case 2:
                        jVar.f7830b = C2273h.m9783a(gVar);
                        break;
                    case 3:
                        jVar.f7831c = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return jVar;
            }
        }
    }
}
