package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dv */
public final class C8591dv implements C2265b<C8476ad> {
    /* renamed from: b */
    private static C8476ad m25837b(C2272g gVar) throws Exception {
        return m25836a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25837b(gVar);
    }

    /* renamed from: a */
    private static C8476ad m25836a(C2272g gVar) throws Exception {
        C8476ad adVar = new C8476ad();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        adVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        adVar.f23200a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        adVar.f23201b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return adVar;
            }
        }
    }
}
