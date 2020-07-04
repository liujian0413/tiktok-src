package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dk */
public final class C8578dk implements C2265b<C8685q> {
    /* renamed from: b */
    private static C8685q m25815b(C2272g gVar) throws Exception {
        return m25814a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25815b(gVar);
    }

    /* renamed from: a */
    private static C8685q m25814a(C2272g gVar) throws Exception {
        C8685q qVar = new C8685q();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        qVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        qVar.f23653a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        qVar.f23654b = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return qVar;
            }
        }
    }
}
