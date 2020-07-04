package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8522bp.C8525c;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fo */
public final class C8638fo implements C2265b<C8525c> {
    /* renamed from: b */
    private static C8525c m25929b(C2272g gVar) throws Exception {
        return m25928a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25929b(gVar);
    }

    /* renamed from: a */
    public static C8525c m25928a(C2272g gVar) throws Exception {
        C8525c cVar = new C8525c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return cVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                cVar.f23434a = _User_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
