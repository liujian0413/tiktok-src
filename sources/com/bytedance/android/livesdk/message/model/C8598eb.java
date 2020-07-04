package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.eb */
public final class C8598eb implements C2265b<C8481ah> {
    /* renamed from: b */
    private static C8481ah m25849b(C2272g gVar) throws Exception {
        return m25848a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25849b(gVar);
    }

    /* renamed from: a */
    private static C8481ah m25848a(C2272g gVar) throws Exception {
        C8481ah ahVar = new C8481ah();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return ahVar;
            } else if (b == 1) {
                ahVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b == 3) {
                ahVar.f23219b = C2273h.m9787e(gVar);
            } else if (b != 6) {
                C2273h.m9789g(gVar);
            } else {
                ahVar.f23218a = C2273h.m9785c(gVar);
            }
        }
    }
}
