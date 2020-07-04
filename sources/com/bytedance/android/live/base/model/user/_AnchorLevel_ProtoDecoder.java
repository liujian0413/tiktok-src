package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _AnchorLevel_ProtoDecoder implements C2265b<C2371c> {
    public final C2371c decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2371c decodeStatic(C2272g gVar) throws Exception {
        C2371c cVar = new C2371c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f7796a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        cVar.f7797b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        cVar.f7798c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cVar.f7799d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        cVar.f7800e = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        cVar.f7801f = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        cVar.f7802g = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        cVar.f7803h = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        cVar.f7804i = C2273h.m9785c(gVar);
                        break;
                    case 10:
                        cVar.f7805j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        cVar.f7806k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 12:
                        cVar.f7807l = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 13:
                        cVar.f7808m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
