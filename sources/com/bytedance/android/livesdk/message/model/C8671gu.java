package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8557cr.C8558a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gu */
public final class C8671gu implements C2265b<C8558a> {
    /* renamed from: b */
    private static C8558a m25993b(C2272g gVar) throws Exception {
        return m25992a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25993b(gVar);
    }

    /* renamed from: a */
    public static C8558a m25992a(C2272g gVar) throws Exception {
        C8558a aVar = new C8558a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23588a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f23589b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f23590c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aVar.f23591d = C2273h.m9787e(gVar);
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
