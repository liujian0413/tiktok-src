package com.bytedance.android.livesdk.chatroom.model.p219a;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.o */
public final class C4864o implements C2265b<C4861l> {
    /* renamed from: b */
    private static C4861l m15875b(C2272g gVar) throws Exception {
        return m15874a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15875b(gVar);
    }

    /* renamed from: a */
    public static C4861l m15874a(C2272g gVar) throws Exception {
        C4861l lVar = new C4861l();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.f13906a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        lVar.f13907b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        lVar.f13908c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        lVar.f13909d = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        lVar.f13910e = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        lVar.f13911f = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        lVar.f13912g = C2273h.m9783a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return lVar;
            }
        }
    }
}
