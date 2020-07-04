package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleSetting_ProtoDecoder implements C2265b<C9362e> {
    public final C9362e decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9362e decodeStatic(C2272g gVar) throws Exception {
        C9362e eVar = new C9362e();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 2:
                        eVar.f25653e = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        eVar.f25652d = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        eVar.f25650b = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        eVar.f25651c = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        eVar.f25649a = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        eVar.f25654f = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        eVar.f25657i = C2273h.m9787e(gVar);
                        break;
                    case 9:
                        eVar.f25658j = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return eVar;
            }
        }
    }
}
