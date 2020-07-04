package com.bytedance.android.livesdk.chatroom.model.p219a;

import com.bytedance.android.livesdk.chatroom.model.p219a.C4851c.C4852a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.n */
public final class C4863n implements C2265b<C4852a> {
    /* renamed from: b */
    private static C4852a m15873b(C2272g gVar) throws Exception {
        return m15872a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15873b(gVar);
    }

    /* renamed from: a */
    public static C4852a m15872a(C2272g gVar) throws Exception {
        C4852a aVar = new C4852a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f13856a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f13857b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f13858c = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aVar.f13860e = (int) C2273h.m9785c(gVar);
                        break;
                    case 5:
                        aVar.f13861f = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f13862g = C2273h.m9783a(gVar);
                        break;
                    case 7:
                        aVar.f13863h = (int) C2273h.m9785c(gVar);
                        break;
                    case 8:
                        aVar.f13859d = (int) C2273h.m9785c(gVar);
                        break;
                    case 9:
                        aVar.f13865j = (int) C2273h.m9785c(gVar);
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
