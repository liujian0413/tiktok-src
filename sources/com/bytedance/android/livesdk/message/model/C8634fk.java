package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._OfficialRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fk */
public final class C8634fk implements C2265b<C8519bn> {
    /* renamed from: b */
    private static C8519bn m25921b(C2272g gVar) throws Exception {
        return m25920a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25921b(gVar);
    }

    /* renamed from: a */
    private static C8519bn m25920a(C2272g gVar) throws Exception {
        C8519bn bnVar = new C8519bn();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bnVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bnVar.f23420a = _OfficialRoomInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bnVar;
            }
        }
    }
}
