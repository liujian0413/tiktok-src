package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gv */
public final class C8672gv implements C2265b<C8557cr> {
    /* renamed from: b */
    private static C8557cr m25995b(C2272g gVar) throws Exception {
        return m25994a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25995b(gVar);
    }

    /* renamed from: a */
    private static C8557cr m25994a(C2272g gVar) throws Exception {
        C8557cr crVar = new C8557cr();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        crVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        crVar.f23586a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        crVar.f23587b = C8671gu.m25992a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return crVar;
            }
        }
    }
}
