package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.em */
public final class C8609em implements C2265b<C8493as> {
    /* renamed from: b */
    private static C8493as m25871b(C2272g gVar) throws Exception {
        return m25870a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25871b(gVar);
    }

    /* renamed from: a */
    private static C8493as m25870a(C2272g gVar) throws Exception {
        C8493as asVar = new C8493as();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        asVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        asVar.f23276a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        asVar.f23277b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        asVar.f23278c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        asVar.f23279d = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return asVar;
            }
        }
    }
}
