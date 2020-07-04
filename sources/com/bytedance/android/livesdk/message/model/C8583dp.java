package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.dp */
public final class C8583dp implements C2265b<C8690u> {
    /* renamed from: b */
    private static C8690u m25825b(C2272g gVar) throws Exception {
        return m25824a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25825b(gVar);
    }

    /* renamed from: a */
    private static C8690u m25824a(C2272g gVar) throws Exception {
        C8690u uVar = new C8690u();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        uVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (uVar.f23678a == null) {
                            uVar.f23678a = new ArrayList();
                        }
                        uVar.f23678a.add(C8651ga.m25952a(gVar));
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return uVar;
            }
        }
    }
}
