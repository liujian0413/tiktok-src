package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dm */
public final class C8580dm implements C2265b<C8687s> {
    /* renamed from: b */
    private static C8687s m25819b(C2272g gVar) throws Exception {
        return m25818a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25819b(gVar);
    }

    /* renamed from: a */
    public static C8687s m25818a(C2272g gVar) throws Exception {
        C8687s sVar = new C8687s();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        sVar.f23667b = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        sVar.f23666a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        sVar.f23668c = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        sVar.f23669d = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return sVar;
            }
        }
    }
}
