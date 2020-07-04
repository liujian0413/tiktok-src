package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.eq */
public final class C8613eq implements C2265b<C8498ax> {
    /* renamed from: b */
    private static C8498ax m25879b(C2272g gVar) throws Exception {
        return m25878a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25879b(gVar);
    }

    /* renamed from: a */
    private static C8498ax m25878a(C2272g gVar) throws Exception {
        C8498ax axVar = new C8498ax();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        axVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        axVar.f23285a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        axVar.f23286b = C2273h.m9784b(gVar);
                        break;
                    case 4:
                        axVar.f23287c = C2273h.m9784b(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return axVar;
            }
        }
    }
}
