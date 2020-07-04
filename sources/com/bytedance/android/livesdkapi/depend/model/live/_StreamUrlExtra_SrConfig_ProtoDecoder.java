package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _StreamUrlExtra_SrConfig_ProtoDecoder implements C2265b<C9384a> {
    public final C9384a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9384a decodeStatic(C2272g gVar) throws Exception {
        C9384a aVar = new C9384a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f25798a = C2273h.m9783a(gVar);
                        break;
                    case 2:
                        aVar.f25800c = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f25799b = C2273h.m9783a(gVar);
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
