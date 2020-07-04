package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _ChannelInfo_ProtoDecoder implements C2265b<C9366i> {
    public final C9366i decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9366i decodeStatic(C2272g gVar) throws Exception {
        C9366i iVar = new C9366i();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f25664a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        iVar.f25665b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        iVar.f25666c = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return iVar;
            }
        }
    }
}
