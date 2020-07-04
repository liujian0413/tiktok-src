package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _FeedBannerContainer_ProtoDecoder implements C2265b<C2338b> {
    public final C2338b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2338b decodeStatic(C2272g gVar) throws Exception {
        C2338b bVar = new C2338b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (bVar.f7676a == null) {
                            bVar.f7676a = new ArrayList();
                        }
                        bVar.f7676a.add(_FeedBanner_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        bVar.f7677b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bVar.f7678c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        bVar.f7679d = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        bVar.f7680e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        bVar.f7681f = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
