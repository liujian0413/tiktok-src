package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TextFormat_ProtoDecoder implements C2265b<C9506g> {
    public final C9506g decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9506g decodeStatic(C2272g gVar) throws Exception {
        C9506g gVar2 = new C9506g();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return gVar2;
            } else if (b != 1) {
                switch (b) {
                    case 3:
                        gVar2.f26018b = C2273h.m9783a(gVar);
                        break;
                    case 4:
                        gVar2.f26019c = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar2.f26017a = C2273h.m9787e(gVar);
            }
        }
    }
}
