package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.eu */
public final class C8617eu implements C2265b<C8502az> {
    /* renamed from: b */
    private static C8502az m25887b(C2272g gVar) throws Exception {
        return m25886a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25887b(gVar);
    }

    /* renamed from: a */
    private static C8502az m25886a(C2272g gVar) throws Exception {
        C8502az azVar = new C8502az();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        azVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        azVar.f23297a = _BattleSetting_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return azVar;
            }
        }
    }
}
