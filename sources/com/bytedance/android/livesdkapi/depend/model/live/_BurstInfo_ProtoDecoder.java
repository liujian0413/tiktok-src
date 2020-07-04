package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BurstInfo_ProtoDecoder implements C2265b<C9365h> {
    public final C9365h decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9365h decodeStatic(C2272g gVar) throws Exception {
        C9365h hVar = new C9365h();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f25660a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        hVar.f25661b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        hVar.f25662c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        hVar.f25663d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return hVar;
            }
        }
    }
}
