package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _OfficialRoomInfo_ProtoDecoder implements C2265b<C9378o> {
    public final C9378o decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9378o decodeStatic(C2272g gVar) throws Exception {
        C9378o oVar = new C9378o();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        oVar.f25743a = C2273h.m9783a(gVar);
                        break;
                    case 2:
                        oVar.f25744b = C2273h.m9783a(gVar);
                        break;
                    case 3:
                        oVar.f25745c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return oVar;
            }
        }
    }
}
