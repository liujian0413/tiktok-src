package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _ChannelInfoInRoom_ProtoDecoder implements C2265b<C9367j> {
    public final C9367j decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9367j decodeStatic(C2272g gVar) throws Exception {
        C9367j jVar = new C9367j();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        jVar.f25664a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        jVar.f25665b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        jVar.f25666c = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return jVar;
            }
        }
    }
}
