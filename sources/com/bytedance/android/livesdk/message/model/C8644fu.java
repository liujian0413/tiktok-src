package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fu */
public final class C8644fu implements C2265b<C8530bt> {
    /* renamed from: b */
    private static C8530bt m25941b(C2272g gVar) throws Exception {
        return m25940a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25941b(gVar);
    }

    /* renamed from: a */
    public static C8530bt m25940a(C2272g gVar) throws Exception {
        C8530bt btVar = new C8530bt();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return btVar;
            } else if (b != 4) {
                switch (b) {
                    case 1:
                        btVar.f23453a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        btVar.f23454b = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                if (btVar.f23455c == null) {
                    btVar.f23455c = new ArrayList();
                }
                btVar.f23455c.add(C8564cx.m25788a(gVar));
            }
        }
    }
}
