package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gs */
public final class C8669gs implements C2265b<C8555cp> {
    /* renamed from: b */
    private static C8555cp m25989b(C2272g gVar) throws Exception {
        return m25988a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25989b(gVar);
    }

    /* renamed from: a */
    public static C8555cp m25988a(C2272g gVar) throws Exception {
        C8555cp cpVar = new C8555cp();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cpVar.f23580a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        cpVar.f23581b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        cpVar.f23582c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cpVar;
            }
        }
    }
}
