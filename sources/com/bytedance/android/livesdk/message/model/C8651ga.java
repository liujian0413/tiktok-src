package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ga */
public final class C8651ga implements C2265b<C8536bz> {
    /* renamed from: b */
    private static C8536bz m25953b(C2272g gVar) throws Exception {
        return m25952a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25953b(gVar);
    }

    /* renamed from: a */
    public static C8536bz m25952a(C2272g gVar) throws Exception {
        C8536bz bzVar = new C8536bz();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bzVar.f23473a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        bzVar.f23474b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bzVar.f23475c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        bzVar.f23476d = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bzVar.f23477e = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        bzVar.f23478f = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        bzVar.f23479g = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        bzVar.f23480h = C2273h.m9785c(gVar);
                        break;
                    case 9:
                        bzVar.f23481i = C8652gb.m25954a(gVar);
                        break;
                    case 10:
                        bzVar.f23482j = C2273h.m9785c(gVar);
                        break;
                    case 11:
                        bzVar.f23483k = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bzVar;
            }
        }
    }
}
