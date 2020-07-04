package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.C2381m.C2383b;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _XiguaUserParams_UserExtendInfo_ProtoDecoder implements C2265b<C2383b> {
    public final C2383b decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2383b decodeStatic(C2272g gVar) throws Exception {
        C2383b bVar = new C2383b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f7870a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        bVar.f7871b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        bVar.f7872c = _XiguaUserParams_RocketSchema_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
