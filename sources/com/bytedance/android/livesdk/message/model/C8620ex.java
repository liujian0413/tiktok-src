package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ex */
public final class C8620ex implements C2265b<C8506bc> {
    /* renamed from: b */
    private static C8506bc m25893b(C2272g gVar) throws Exception {
        return m25892a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25893b(gVar);
    }

    /* renamed from: a */
    private static C8506bc m25892a(C2272g gVar) throws Exception {
        C8506bc bcVar = new C8506bc();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bcVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bcVar.f23315b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                bcVar.mo21654a();
                return bcVar;
            }
        }
    }
}
