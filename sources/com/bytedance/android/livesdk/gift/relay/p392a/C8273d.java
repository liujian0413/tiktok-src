package com.bytedance.android.livesdk.gift.relay.p392a;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.gift.relay.a.d */
public final class C8273d implements C2265b<C8269a> {
    /* renamed from: b */
    private static C8269a m25296b(C2272g gVar) throws Exception {
        return m25295a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25296b(gVar);
    }

    /* renamed from: a */
    public static C8269a m25295a(C2272g gVar) throws Exception {
        C8269a aVar = new C8269a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f22697b = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f22698c = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f22699d = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aVar.f22700e = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        aVar.f22701f = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f22702g = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        aVar.f22703h = C2273h.m9783a(gVar);
                        break;
                    case 8:
                        aVar.f22704i = C2273h.m9783a(gVar);
                        break;
                    case 9:
                        aVar.f22705j = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        aVar.f22706k = C2273h.m9785c(gVar);
                        break;
                    case 11:
                        aVar.f22707l = C2273h.m9785c(gVar);
                        break;
                    case 12:
                        aVar.f22708m = C2273h.m9785c(gVar);
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
