package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdkapi.depend.model.live._BannerInRoom_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ay */
public final class C4892ay implements C2265b<C4900a> {
    /* renamed from: b */
    private static C4900a m15881b(C2272g gVar) throws Exception {
        return m15880a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15881b(gVar);
    }

    /* renamed from: a */
    public static C4900a m15880a(C2272g gVar) throws Exception {
        C4900a aVar = new C4900a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f14013a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        if (aVar.f14014b == null) {
                            aVar.f14014b = new ArrayList();
                        }
                        aVar.f14014b.add(_BannerInRoom_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 3:
                        aVar.f14015c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f14016d = C4891ax.m15878a(gVar);
                        break;
                    case 5:
                        aVar.f14017e = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        aVar.f14018f = (int) C2273h.m9785c(gVar);
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
