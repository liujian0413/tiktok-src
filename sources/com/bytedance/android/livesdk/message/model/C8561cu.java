package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.cu */
public final class C8561cu implements C2265b<C8472a> {
    /* renamed from: b */
    private static C8472a m25783b(C2272g gVar) throws Exception {
        return m25782a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25783b(gVar);
    }

    /* renamed from: a */
    private static C8472a m25782a(C2272g gVar) throws Exception {
        C8472a aVar = new C8472a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f23186a = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f23187b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f23188c = C2273h.m9783a(gVar);
                        break;
                    case 5:
                        aVar.f23189d = C2273h.m9783a(gVar);
                        break;
                    case 6:
                        aVar.f23190e = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        aVar.f23191f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        aVar.f23192g = C8604eh.m25860a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return aVar;
            }
        }
    }
}
