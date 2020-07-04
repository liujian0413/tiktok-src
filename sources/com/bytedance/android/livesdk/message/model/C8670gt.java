package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gt */
public final class C8670gt implements C2265b<C8556cq> {
    /* renamed from: b */
    private static C8556cq m25991b(C2272g gVar) throws Exception {
        return m25990a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25991b(gVar);
    }

    /* renamed from: a */
    private static C8556cq m25990a(C2272g gVar) throws Exception {
        C8556cq cqVar = new C8556cq();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cqVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cqVar.f23583a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        cqVar.f23584b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cqVar.f23585c = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cqVar;
            }
        }
    }
}
