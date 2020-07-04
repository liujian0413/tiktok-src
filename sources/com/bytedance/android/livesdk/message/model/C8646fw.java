package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fw */
public final class C8646fw implements C2265b<C8533bw> {
    /* renamed from: b */
    private static C8533bw m25945b(C2272g gVar) throws Exception {
        return m25944a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25945b(gVar);
    }

    /* renamed from: a */
    private static C8533bw m25944a(C2272g gVar) throws Exception {
        C8533bw bwVar = new C8533bw();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return bwVar;
            } else if (b == 1) {
                bwVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                C2273h.m9789g(gVar);
            } else {
                bwVar.f23460a = C8647fx.m25946a(gVar);
            }
        }
    }
}
