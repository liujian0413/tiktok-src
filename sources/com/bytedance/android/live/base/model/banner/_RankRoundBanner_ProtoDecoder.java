package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model.live._Ranking_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _RankRoundBanner_ProtoDecoder implements C2265b<C2339c> {
    public final C2339c decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2339c decodeStatic(C2272g gVar) throws Exception {
        C2339c cVar = new C2339c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (cVar.f7683b == null) {
                            cVar.f7683b = new ArrayList();
                        }
                        cVar.f7683b.add(_Ranking_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        cVar.f7682a = (int) C2273h.m9785c(gVar);
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
