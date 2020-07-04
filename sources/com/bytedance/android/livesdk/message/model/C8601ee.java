package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8484ak.C8485a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ee */
public final class C8601ee implements C2265b<C8485a> {
    /* renamed from: b */
    private static C8485a m25855b(C2272g gVar) throws Exception {
        return m25854a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25855b(gVar);
    }

    /* renamed from: a */
    public static C8485a m25854a(C2272g gVar) throws Exception {
        C8485a aVar = new C8485a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23239a = C2273h.m9784b(gVar);
                        break;
                    case 2:
                        aVar.f23240b = C2273h.m9783a(gVar);
                        break;
                    case 3:
                        aVar.f23241c = C2273h.m9783a(gVar);
                        break;
                    case 4:
                        aVar.f23242d = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
