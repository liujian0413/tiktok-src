package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.dd */
public final class C8571dd implements C2265b<C8678k> {
    /* renamed from: b */
    private static C8678k m25801b(C2272g gVar) throws Exception {
        return m25800a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25801b(gVar);
    }

    /* renamed from: a */
    public static C8678k m25800a(C2272g gVar) throws Exception {
        C8678k kVar = new C8678k();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        kVar.f23620a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        kVar.f23621b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return kVar;
            }
        }
    }
}
