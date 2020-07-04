package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fq */
public final class C8640fq implements C2265b<C8522bp> {
    /* renamed from: b */
    private static C8522bp m25933b(C2272g gVar) throws Exception {
        return m25932a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25933b(gVar);
    }

    /* renamed from: a */
    private static C8522bp m25932a(C2272g gVar) throws Exception {
        C8522bp bpVar = new C8522bp();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bpVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bpVar.f23426a = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bpVar.f23427b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        bpVar.f23428c = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bpVar.f23429d = C8637fn.m25926a(gVar);
                        break;
                    case 6:
                        bpVar.f23430e = C8639fp.m25930a(gVar);
                        break;
                    case 7:
                        bpVar.f23431f = C8638fo.m25928a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                bpVar.mo21666a();
                return bpVar;
            }
        }
    }
}
