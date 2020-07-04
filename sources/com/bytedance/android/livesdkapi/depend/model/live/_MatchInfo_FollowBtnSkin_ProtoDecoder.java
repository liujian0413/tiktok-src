package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C9373m.C9374a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _MatchInfo_FollowBtnSkin_ProtoDecoder implements C2265b<C9374a> {
    public final C9374a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9374a decodeStatic(C2272g gVar) throws Exception {
        C9374a aVar = new C9374a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f25721a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f25722b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f25723c = C2273h.m9787e(gVar);
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
