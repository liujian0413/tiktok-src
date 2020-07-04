package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fs */
public final class C8642fs implements C2265b<C8528br> {
    /* renamed from: b */
    private static C8528br m25937b(C2272g gVar) throws Exception {
        return m25936a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25937b(gVar);
    }

    /* renamed from: a */
    private static C8528br m25936a(C2272g gVar) throws Exception {
        C8528br brVar = new C8528br();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b == -1) {
                gVar.mo8058a(a);
                return brVar;
            } else if (b == 1) {
                brVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                switch (b) {
                    case 5:
                        brVar.f23443c = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        brVar.f23441a = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        brVar.f23442b = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                brVar.f23444d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
