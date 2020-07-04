package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ba */
public final class C4895ba implements C2265b<C4869ad> {
    /* renamed from: b */
    private static C4869ad m15885b(C2272g gVar) throws Exception {
        return m15884a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15885b(gVar);
    }

    /* renamed from: a */
    public static C4869ad m15884a(C2272g gVar) throws Exception {
        C4869ad adVar = new C4869ad();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        adVar.f13933a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        adVar.f13934b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return adVar;
            }
        }
    }
}
