package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.C2381m.C2382a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _XiguaUserParams_RocketSchema_ProtoDecoder implements C2265b<C2382a> {
    public final C2382a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2382a decodeStatic(C2272g gVar) throws Exception {
        C2382a aVar = new C2382a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f7867a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f7868b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f7869c = C2273h.m9787e(gVar);
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
