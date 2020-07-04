package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ek */
public final class C8607ek implements C2265b<C8491aq> {
    /* renamed from: b */
    private static C8491aq m25867b(C2272g gVar) throws Exception {
        return m25866a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25867b(gVar);
    }

    /* renamed from: a */
    private static C8491aq m25866a(C2272g gVar) throws Exception {
        C8491aq aqVar = new C8491aq();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aqVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aqVar.f23268a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aqVar.f23269b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        if (aqVar.f23270c == null) {
                            aqVar.f23270c = new ArrayList();
                        }
                        aqVar.f23270c.add(C8608el.m25868a(gVar));
                        break;
                    case 5:
                        aqVar.f23271d = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aqVar;
            }
        }
    }
}
