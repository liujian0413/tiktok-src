package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.cx */
public final class C8564cx implements C2265b<C8596e> {
    /* renamed from: b */
    private static C8596e m25789b(C2272g gVar) throws Exception {
        return m25788a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25789b(gVar);
    }

    /* renamed from: a */
    public static C8596e m25788a(C2272g gVar) throws Exception {
        C8596e eVar = new C8596e();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f23595a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        eVar.f23596b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        eVar.f23597c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        eVar.f23598d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        eVar.f23599e = C2273h.m9783a(gVar);
                        break;
                    case 6:
                        eVar.f23600f = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        eVar.f23601g = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return eVar;
            }
        }
    }
}
