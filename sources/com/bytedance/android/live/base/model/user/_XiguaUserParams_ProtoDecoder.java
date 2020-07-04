package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _XiguaUserParams_ProtoDecoder implements C2265b<C2381m> {
    public final C2381m decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2381m decodeStatic(C2272g gVar) throws Exception {
        C2381m mVar = new C2381m();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        mVar.f7860a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        mVar.f7861b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        mVar.f7862c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        mVar.f7863d = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        mVar.f7864e = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        mVar.f7865f = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        mVar.f7866g = _XiguaUserParams_UserExtendInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return mVar;
            }
        }
    }
}
