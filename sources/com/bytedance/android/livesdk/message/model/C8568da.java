package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.da */
public final class C8568da implements C2265b<C8675h> {
    /* renamed from: b */
    private static C8675h m25795b(C2272g gVar) throws Exception {
        return m25794a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25795b(gVar);
    }

    /* renamed from: a */
    private static C8675h m25794a(C2272g gVar) throws Exception {
        C8675h hVar = new C8675h();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        hVar.f23610a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        hVar.f23611b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return hVar;
            }
        }
    }
}
