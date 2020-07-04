package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gd */
public final class C8654gd implements C2265b<C8541cc> {
    /* renamed from: b */
    private static C8541cc m25959b(C2272g gVar) throws Exception {
        return m25958a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25959b(gVar);
    }

    /* renamed from: a */
    private static C8541cc m25958a(C2272g gVar) throws Exception {
        C8541cc ccVar = new C8541cc();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ccVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        ccVar.f23502a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        ccVar.f23503b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        ccVar.f23504c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        ccVar.f23505d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        ccVar.f23506e = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        ccVar.f23507f = String.valueOf(C2273h.m9785c(gVar));
                        break;
                    case 8:
                        ccVar.f23508g = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return ccVar;
            }
        }
    }
}
