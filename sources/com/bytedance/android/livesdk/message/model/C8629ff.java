package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8514bj.C8515a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ff */
public final class C8629ff implements C2265b<C8515a> {
    /* renamed from: b */
    private static C8515a m25911b(C2272g gVar) throws Exception {
        return m25910a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25911b(gVar);
    }

    /* renamed from: a */
    public static C8515a m25910a(C2272g gVar) throws Exception {
        C8515a aVar = new C8515a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23403a = (int) C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f23404b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        aVar.f23406d = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        aVar.f23405c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        aVar.f23407e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        aVar.f23408f = C2273h.m9784b(gVar);
                        break;
                    case 7:
                        aVar.f23409g = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        aVar.f23410h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
