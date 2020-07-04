package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.User.C2366a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

public final class _User_OwnRoom_ProtoDecoder implements C2265b<C2366a> {
    public final C2366a decode(C2272g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2366a decodeStatic(C2272g gVar) throws Exception {
        C2366a aVar = new C2366a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                if (aVar.f7791a == null) {
                    aVar.f7791a = new ArrayList();
                }
                aVar.f7791a.add(Long.valueOf(C2273h.m9785c(gVar)));
            }
        }
    }
}
