package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C8688t.C8689a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dn */
public final class C8581dn implements C2265b<C8689a> {
    /* renamed from: b */
    private static C8689a m25821b(C2272g gVar) throws Exception {
        return m25820a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25821b(gVar);
    }

    /* renamed from: a */
    public static C8689a m25820a(C2272g gVar) throws Exception {
        C8689a aVar = new C8689a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23673a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        aVar.f23674b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f23675c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f23676d = _Text_ProtoDecoder.decodeStatic(gVar);
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
