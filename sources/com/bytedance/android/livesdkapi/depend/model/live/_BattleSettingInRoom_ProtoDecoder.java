package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _BattleSettingInRoom_ProtoDecoder implements C2265b<C9363f> {
    public final C9363f decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9363f decodeStatic(C2272g gVar) throws Exception {
        C9363f fVar = new C9363f();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f25649a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        fVar.f25650b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        fVar.f25655g = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        fVar.f25652d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        fVar.f25651c = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        fVar.f25656h = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        fVar.f25653e = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        fVar.f25654f = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fVar;
            }
        }
    }
}
