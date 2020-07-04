package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.cy */
public final class C8565cy implements C2265b<C8623f> {
    /* renamed from: b */
    private static C8623f m25791b(C2272g gVar) throws Exception {
        return m25790a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25791b(gVar);
    }

    /* renamed from: a */
    private static C8623f m25790a(C2272g gVar) throws Exception {
        C8623f fVar = new C8623f();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f23602a = C8605ei.m25862a(gVar);
                        break;
                    case 2:
                        fVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return fVar;
            }
        }
    }
}
