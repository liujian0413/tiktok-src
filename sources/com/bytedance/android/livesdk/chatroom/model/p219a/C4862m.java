package com.bytedance.android.livesdk.chatroom.model.p219a;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.m */
public final class C4862m implements C2265b<C4851c> {
    /* renamed from: b */
    private static C4851c m15871b(C2272g gVar) throws Exception {
        return m15870a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15871b(gVar);
    }

    /* renamed from: a */
    private static C4851c m15870a(C2272g gVar) throws Exception {
        C4851c cVar = new C4851c();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cVar.f13853a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        cVar.f13854b = C4863n.m15872a(gVar);
                        break;
                    case 4:
                        cVar.f13855c = C2273h.m9785c(gVar);
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
