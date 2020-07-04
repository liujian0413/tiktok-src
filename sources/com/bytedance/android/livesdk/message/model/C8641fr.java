package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fr */
public final class C8641fr implements C2265b<C8527bq> {
    /* renamed from: b */
    private static C8527bq m25935b(C2272g gVar) throws Exception {
        return m25934a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25935b(gVar);
    }

    /* renamed from: a */
    private static C8527bq m25934a(C2272g gVar) throws Exception {
        C8527bq bqVar = new C8527bq();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bqVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bqVar.f23439a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        bqVar.f23440b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bqVar;
            }
        }
    }
}
