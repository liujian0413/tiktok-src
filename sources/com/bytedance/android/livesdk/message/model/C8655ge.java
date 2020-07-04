package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ge */
public final class C8655ge implements C2265b<C8542cd> {
    /* renamed from: b */
    private static C8542cd m25961b(C2272g gVar) throws Exception {
        return m25960a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25961b(gVar);
    }

    /* renamed from: a */
    private static C8542cd m25960a(C2272g gVar) throws Exception {
        C8542cd cdVar = new C8542cd();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cdVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cdVar.f23515c = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        cdVar.f23513a = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cdVar.f23514b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cdVar;
            }
        }
    }
}
