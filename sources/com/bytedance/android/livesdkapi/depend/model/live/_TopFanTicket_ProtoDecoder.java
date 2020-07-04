package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

public final class _TopFanTicket_ProtoDecoder implements C2265b<C9385u> {
    public final C9385u decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C9385u decodeStatic(C2272g gVar) throws Exception {
        C9385u uVar = new C9385u();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        uVar.f25801a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        uVar.f25802b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return uVar;
            }
        }
    }
}
