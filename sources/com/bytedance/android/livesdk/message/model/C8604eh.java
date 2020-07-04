package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.eh */
public final class C8604eh implements C2265b<C8488an> {
    /* renamed from: b */
    private static C8488an m25861b(C2272g gVar) throws Exception {
        return m25860a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25861b(gVar);
    }

    /* renamed from: a */
    public static C8488an m25860a(C2272g gVar) throws Exception {
        C8488an anVar = new C8488an();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (anVar.f23249a == null) {
                            anVar.f23249a = new ArrayList();
                        }
                        anVar.f23249a.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    case 2:
                        anVar.f23250b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        anVar.f23251c = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return anVar;
            }
        }
    }
}
