package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fm */
public final class C8636fm implements C2265b<C8520bo> {
    /* renamed from: b */
    private static C8520bo m25925b(C2272g gVar) throws Exception {
        return m25924a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25925b(gVar);
    }

    /* renamed from: a */
    private static C8520bo m25924a(C2272g gVar) throws Exception {
        C8520bo boVar = new C8520bo();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        boVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        boVar.f23421a = C8635fl.m25922a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return boVar;
            }
        }
    }
}
