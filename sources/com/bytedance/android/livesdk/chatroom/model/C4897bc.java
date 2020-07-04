package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bc */
public final class C4897bc implements C2265b<C4872ag> {
    /* renamed from: b */
    private static C4872ag m15889b(C2272g gVar) throws Exception {
        return m15888a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15889b(gVar);
    }

    /* renamed from: a */
    public static C4872ag m15888a(C2272g gVar) throws Exception {
        C4872ag agVar = new C4872ag();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (agVar.f13940b == null) {
                            agVar.f13940b = new ArrayList();
                        }
                        agVar.f13940b.add(C4896bb.m15886a(gVar));
                        break;
                    case 2:
                        agVar.f13939a = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return agVar;
            }
        }
    }
}
