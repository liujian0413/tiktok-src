package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8520bo.C8521a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fl */
public final class C8635fl implements C2265b<C8521a> {
    /* renamed from: b */
    private static C8521a m25923b(C2272g gVar) throws Exception {
        return m25922a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25923b(gVar);
    }

    /* renamed from: a */
    public static C8521a m25922a(C2272g gVar) throws Exception {
        C8521a aVar = new C8521a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b != 1) {
                switch (b) {
                    case 3:
                        aVar.f23424c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aVar.f23425d = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                aVar.f23422a = C2273h.m9784b(gVar);
            }
        }
    }
}
