package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dg */
public final class C8574dg implements C2265b<C8681n> {
    /* renamed from: b */
    private static C8681n m25807b(C2272g gVar) throws Exception {
        return m25806a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25807b(gVar);
    }

    /* renamed from: a */
    private static C8681n m25806a(C2272g gVar) throws Exception {
        C8681n nVar = new C8681n();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        nVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        nVar.f23631a = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        nVar.f23632b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return nVar;
            }
        }
    }
}
