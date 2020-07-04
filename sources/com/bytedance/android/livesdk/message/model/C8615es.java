package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8499ay.C8500a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.es */
public final class C8615es implements C2265b<C8500a> {
    /* renamed from: b */
    private static C8500a m25883b(C2272g gVar) throws Exception {
        return m25882a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25883b(gVar);
    }

    /* renamed from: a */
    public static C8500a m25882a(C2272g gVar) throws Exception {
        C8500a aVar = new C8500a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aVar;
            } else if (b != 1) {
                C2273h.m9789g(gVar);
            } else {
                if (aVar.f23292a == null) {
                    aVar.f23292a = new ArrayList();
                }
                aVar.f23292a.add(C8616et.m25884a(gVar));
            }
        }
    }
}
