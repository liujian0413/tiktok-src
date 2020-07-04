package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8478af.C8479a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dy */
public final class C8594dy implements C2265b<C8479a> {
    /* renamed from: b */
    private static C8479a m25843b(C2272g gVar) throws Exception {
        return m25842a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25843b(gVar);
    }

    /* renamed from: a */
    public static C8479a m25842a(C2272g gVar) throws Exception {
        C8479a aVar = new C8479a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23213a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f23214b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        aVar.f23215c = C2273h.m9784b(gVar);
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
