package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gl */
public final class C8662gl implements C2265b<C8547ci> {
    /* renamed from: b */
    private static C8547ci m25975b(C2272g gVar) throws Exception {
        return m25974a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25975b(gVar);
    }

    /* renamed from: a */
    private static C8547ci m25974a(C2272g gVar) throws Exception {
        C8547ci ciVar = new C8547ci();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ciVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        ciVar.f23540a = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        ciVar.f23541b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return ciVar;
            }
        }
    }
}
