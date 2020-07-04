package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _Ranking_ProtoDecoder implements C2265b<C2353d> {
    public final C2353d decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2353d decodeStatic(C2272g gVar) throws Exception {
        C2353d dVar = new C2353d();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f7725d = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        if (dVar.f7724c == null) {
                            dVar.f7724c = new ArrayList();
                        }
                        dVar.f7724c.add(_RankUser_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 3:
                        dVar.f7723b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        dVar.f7722a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        dVar.f7726e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
