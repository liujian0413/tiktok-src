package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2270e;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.eo */
public final class C8611eo implements C2265b<C8495au> {
    /* renamed from: b */
    private static C8495au m25875b(C2272g gVar) throws Exception {
        return m25874a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25875b(gVar);
    }

    /* renamed from: a */
    private static C8495au m25874a(C2272g gVar) throws Exception {
        C8495au auVar = new C8495au();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        auVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        auVar.f23281a = C2270e.m9766a(C2273h.m9787e(gVar));
                        break;
                    case 3:
                        auVar.f23282b = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return auVar;
            }
        }
    }
}
