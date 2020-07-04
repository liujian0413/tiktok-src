package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8522bp.C8524b;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fn */
public final class C8637fn implements C2265b<C8524b> {
    /* renamed from: b */
    private static C8524b m25927b(C2272g gVar) throws Exception {
        return m25926a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25927b(gVar);
    }

    /* renamed from: a */
    public static C8524b m25926a(C2272g gVar) throws Exception {
        C8524b bVar = new C8524b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return bVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                bVar.f23433a = _User_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
