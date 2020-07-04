package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fi */
public final class C8632fi implements C2265b<C8517bl> {
    /* renamed from: b */
    private static C8517bl m25917b(C2272g gVar) throws Exception {
        return m25916a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25917b(gVar);
    }

    /* renamed from: a */
    private static C8517bl m25916a(C2272g gVar) throws Exception {
        C8517bl blVar = new C8517bl();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        blVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        blVar.f23412a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        blVar.f23413b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return blVar;
            }
        }
    }
}
