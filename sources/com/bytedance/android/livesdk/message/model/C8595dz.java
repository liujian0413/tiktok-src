package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dz */
public final class C8595dz implements C2265b<C8480ag> {
    /* renamed from: b */
    private static C8480ag m25845b(C2272g gVar) throws Exception {
        return m25844a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25845b(gVar);
    }

    /* renamed from: a */
    private static C8480ag m25844a(C2272g gVar) throws Exception {
        C8480ag agVar = new C8480ag();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return agVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                agVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
