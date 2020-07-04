package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._FlexImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gj */
public final class C8660gj implements C2265b<C8545cg> {
    /* renamed from: b */
    private static C8545cg m25971b(C2272g gVar) throws Exception {
        return m25970a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25971b(gVar);
    }

    /* renamed from: a */
    private static C8545cg m25970a(C2272g gVar) throws Exception {
        C8545cg cgVar = new C8545cg();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cgVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cgVar.f23524b = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        cgVar.f23527e = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        cgVar.f23528f = String.valueOf(C2273h.m9785c(gVar));
                        break;
                    case 8:
                        cgVar.f23529g = C2273h.m9785c(gVar);
                        break;
                    case 10:
                        cgVar.f23532j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        cgVar.f23531i = _FlexImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 12:
                        cgVar.f23533k = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cgVar;
            }
        }
    }
}
