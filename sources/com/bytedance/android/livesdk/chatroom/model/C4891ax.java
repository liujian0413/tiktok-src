package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ax */
public final class C4891ax implements C2265b<C4894b> {
    /* renamed from: b */
    private static C4894b m15879b(C2272g gVar) throws Exception {
        return m15878a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15879b(gVar);
    }

    /* renamed from: a */
    public static C4894b m15878a(C2272g gVar) throws Exception {
        C4894b bVar = new C4894b();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f14005a = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bVar.f14007c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bVar.f14008d = C2273h.m9783a(gVar);
                        break;
                    case 4:
                        bVar.f14006b = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bVar;
            }
        }
    }
}
