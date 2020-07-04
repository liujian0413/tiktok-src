package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dw */
public final class C8592dw implements C2265b<C8477ae> {
    /* renamed from: b */
    private static C8477ae m25839b(C2272g gVar) throws Exception {
        return m25838a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25839b(gVar);
    }

    /* renamed from: a */
    private static C8477ae m25838a(C2272g gVar) throws Exception {
        C8477ae aeVar = new C8477ae();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return aeVar;
            } else if (b == 1) {
                aeVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 12) {
                switch (b) {
                    case 5:
                        aeVar.f23202a = C2273h.m9784b(gVar);
                        break;
                    case 6:
                        aeVar.f23203b = C2273h.m9784b(gVar);
                        break;
                    case 7:
                        aeVar.f23204c = C2273h.m9784b(gVar);
                        break;
                    case 8:
                        aeVar.f23205d = C2273h.m9784b(gVar);
                        break;
                    case 9:
                        aeVar.f23206e = C2273h.m9784b(gVar);
                        break;
                    case 10:
                        aeVar.f23207f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                aeVar.f23208g = C2273h.m9785c(gVar);
            }
        }
    }
}
