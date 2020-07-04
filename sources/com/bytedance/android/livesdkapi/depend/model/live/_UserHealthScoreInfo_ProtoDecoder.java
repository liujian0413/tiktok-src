package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _UserHealthScoreInfo_ProtoDecoder implements C2265b<C9387w> {
    public final C9387w decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9387w decodeStatic(C2272g gVar) throws Exception {
        C9387w wVar = new C9387w();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        wVar.f25810a = C2273h.m9786d(gVar);
                        break;
                    case 2:
                        wVar.f25811b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        wVar.f25812c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return wVar;
            }
        }
    }
}
