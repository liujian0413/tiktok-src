package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gi */
public final class C8659gi implements C2265b<C8544cf> {
    /* renamed from: b */
    private static C8544cf m25969b(C2272g gVar) throws Exception {
        return m25968a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25969b(gVar);
    }

    /* renamed from: a */
    private static C8544cf m25968a(C2272g gVar) throws Exception {
        C8544cf cfVar = new C8544cf();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cfVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cfVar.f23520d = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        cfVar.f23518b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cfVar.f23517a = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        cfVar.f23522f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        cfVar.f23521e = C8658gh.m25966a(gVar);
                        break;
                    case 7:
                        cfVar.f23519c = (int) C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cfVar;
            }
        }
    }
}
