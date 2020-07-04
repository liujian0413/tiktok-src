package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gp */
public final class C8666gp implements C2265b<C8551cm> {
    /* renamed from: b */
    private static C8551cm m25983b(C2272g gVar) throws Exception {
        return m25982a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25983b(gVar);
    }

    /* renamed from: a */
    public static C8551cm m25982a(C2272g gVar) throws Exception {
        C8551cm cmVar = new C8551cm();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cmVar.f23555a = C8665go.m25980a(gVar);
                        break;
                    case 2:
                        cmVar.f23556b = C8665go.m25980a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cmVar;
            }
        }
    }
}
