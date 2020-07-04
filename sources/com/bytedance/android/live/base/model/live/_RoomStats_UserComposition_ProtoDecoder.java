package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model.live.RoomStats.C2349a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _RoomStats_UserComposition_ProtoDecoder implements C2265b<C2349a> {
    public final C2349a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2349a decodeStatic(C2272g gVar) throws Exception {
        C2349a aVar = new C2349a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f7714a = C2273h.m9786d(gVar);
                        break;
                    case 2:
                        aVar.f7715b = C2273h.m9786d(gVar);
                        break;
                    case 3:
                        aVar.f7716c = C2273h.m9786d(gVar);
                        break;
                    case 4:
                        aVar.f7717d = C2273h.m9786d(gVar);
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
