package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.en */
public final class C8610en implements C2265b<C8494at> {
    /* renamed from: b */
    private static C8494at m25873b(C2272g gVar) throws Exception {
        return m25872a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25873b(gVar);
    }

    /* renamed from: a */
    private static C8494at m25872a(C2272g gVar) throws Exception {
        C8494at atVar = new C8494at();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        atVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (atVar.f23280a == null) {
                            atVar.f23280a = new ArrayList();
                        }
                        atVar.f23280a.add(Long.valueOf(C2273h.m9785c(gVar)));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return atVar;
            }
        }
    }
}
