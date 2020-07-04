package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bb */
public final class C4896bb implements C2265b<C4871af> {
    /* renamed from: b */
    private static C4871af m15887b(C2272g gVar) throws Exception {
        return m15886a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15887b(gVar);
    }

    /* renamed from: a */
    public static C4871af m15886a(C2272g gVar) throws Exception {
        C4871af afVar = new C4871af();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        afVar.f13937a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        afVar.f13938b = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return afVar;
            }
        }
    }
}
