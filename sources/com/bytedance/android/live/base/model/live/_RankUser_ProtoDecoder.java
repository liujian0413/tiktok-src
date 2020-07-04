package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RankUser_ProtoDecoder implements C2265b<C2352c> {
    public final C2352c decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2352c decodeStatic(C2272g gVar) throws Exception {
        C2352c cVar = new C2352c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f7719b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cVar.f7721d = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        cVar.f7718a = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cVar.f7720c = (int) C2273h.m9785c(gVar);
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
