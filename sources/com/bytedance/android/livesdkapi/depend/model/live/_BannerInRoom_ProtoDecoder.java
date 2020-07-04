package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BannerInRoom_ProtoDecoder implements C2265b<C9357a> {
    public final C9357a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9357a decodeStatic(C2272g gVar) throws Exception {
        C9357a aVar = new C9357a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f25623a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f25624b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f25625c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f25626d = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        aVar.f25627e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f25628f = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        aVar.f25630h = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        aVar.f25631i = (int) C2273h.m9785c(gVar);
                        break;
                    case 10:
                        aVar.f25629g = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
