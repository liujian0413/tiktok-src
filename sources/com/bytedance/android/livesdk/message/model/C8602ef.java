package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ef */
public final class C8602ef implements C2265b<C8484ak> {
    /* renamed from: b */
    private static C8484ak m25857b(C2272g gVar) throws Exception {
        return m25856a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25857b(gVar);
    }

    /* renamed from: a */
    private static C8484ak m25856a(C2272g gVar) throws Exception {
        C8484ak akVar = new C8484ak();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return akVar;
            } else if (b != 8) {
                switch (b) {
                    case 1:
                        akVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        akVar.f23233a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        akVar.f23234b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        akVar.f23235c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        akVar.f23236d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                akVar.f23238f = C8601ee.m25854a(gVar);
            }
        }
    }
}
