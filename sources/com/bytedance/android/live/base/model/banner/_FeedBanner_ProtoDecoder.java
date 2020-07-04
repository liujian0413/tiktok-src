package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _FeedBanner_ProtoDecoder implements C2265b<C2337a> {
    public final C2337a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2337a decodeStatic(C2272g gVar) throws Exception {
        C2337a aVar = new C2337a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f7673l = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f7663b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        if (aVar.f7664c == null) {
                            aVar.f7664c = new ArrayList();
                        }
                        aVar.f7664c.add(C2273h.m9787e(gVar));
                        break;
                    case 4:
                        aVar.f7665d = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        aVar.f7666e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f7667f = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        aVar.f7662a = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        aVar.f7668g = C2273h.m9787e(gVar);
                        break;
                    case 11:
                        aVar.f7674m = (int) C2273h.m9785c(gVar);
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
