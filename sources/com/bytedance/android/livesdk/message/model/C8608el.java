package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.el */
public final class C8608el implements C2265b<C8492ar> {
    /* renamed from: b */
    private static C8492ar m25869b(C2272g gVar) throws Exception {
        return m25868a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25869b(gVar);
    }

    /* renamed from: a */
    public static C8492ar m25868a(C2272g gVar) throws Exception {
        C8492ar arVar = new C8492ar();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        arVar.f23275d = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        arVar.f23273b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        arVar.f23274c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        arVar.f23272a = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return arVar;
            }
        }
    }
}
