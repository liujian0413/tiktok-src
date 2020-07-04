package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.az */
public final class C4893az implements C2265b<C4899c> {
    /* renamed from: b */
    private static C4899c m15883b(C2272g gVar) throws Exception {
        return m15882a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15883b(gVar);
    }

    /* renamed from: a */
    public static C4899c m15882a(C2272g gVar) throws Exception {
        C4899c cVar = new C4899c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f14010b = C4892ay.m15880a(gVar);
                        break;
                    case 2:
                        cVar.f14009a = C4892ay.m15880a(gVar);
                        break;
                    case 3:
                        cVar.f14011c = C4892ay.m15880a(gVar);
                        break;
                    case 4:
                        cVar.f14012d = C4892ay.m15880a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cVar;
            }
        }
    }
}
