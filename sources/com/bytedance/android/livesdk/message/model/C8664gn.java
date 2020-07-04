package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gn */
public final class C8664gn implements C2265b<C8550cl> {
    /* renamed from: b */
    private static C8550cl m25979b(C2272g gVar) throws Exception {
        return m25978a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25979b(gVar);
    }

    /* renamed from: a */
    private static C8550cl m25978a(C2272g gVar) throws Exception {
        C8550cl clVar = new C8550cl();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        clVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        clVar.f23552b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        clVar.f23554d = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        clVar.f23551a = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        clVar.f23553c = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return clVar;
            }
        }
    }
}
