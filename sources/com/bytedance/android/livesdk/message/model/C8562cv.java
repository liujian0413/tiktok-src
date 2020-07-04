package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.C4893az;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.cv */
public final class C8562cv implements C2265b<C8503b> {
    /* renamed from: b */
    private static C8503b m25785b(C2272g gVar) throws Exception {
        return m25784a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25785b(gVar);
    }

    /* renamed from: a */
    private static C8503b m25784a(C2272g gVar) throws Exception {
        C8503b bVar = new C8503b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return bVar;
            } else if (b == 1) {
                bVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                C2273h.m9789g(gVar);
            } else {
                bVar.f23298a = C4893az.m15882a(gVar);
            }
        }
    }
}
