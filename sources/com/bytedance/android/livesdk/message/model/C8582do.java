package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.do */
public final class C8582do implements C2265b<C8688t> {
    /* renamed from: b */
    private static C8688t m25823b(C2272g gVar) throws Exception {
        return m25822a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25823b(gVar);
    }

    /* renamed from: a */
    private static C8688t m25822a(C2272g gVar) throws Exception {
        C8688t tVar = new C8688t();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        tVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        tVar.f23670a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        tVar.f23671b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        tVar.f23672c = C8581dn.m25820a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return tVar;
            }
        }
    }
}
