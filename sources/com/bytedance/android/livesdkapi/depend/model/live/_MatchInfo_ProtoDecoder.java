package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _MatchInfo_ProtoDecoder implements C2265b<C9373m> {
    public final C9373m decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9373m decodeStatic(C2272g gVar) throws Exception {
        C9373m mVar = new C9373m();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return mVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                mVar.f25720a = _MatchInfo_MatchSkinInfo_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
