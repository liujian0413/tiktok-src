package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8499ay.C8500a.C8501a;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.et */
public final class C8616et implements C2265b<C8501a> {
    /* renamed from: b */
    private static C8501a m25885b(C2272g gVar) throws Exception {
        return m25884a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25885b(gVar);
    }

    /* renamed from: a */
    public static C8501a m25884a(C2272g gVar) throws Exception {
        C8501a aVar = new C8501a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23293a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        aVar.f23294b = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        aVar.f23295c = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        aVar.f23296d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
