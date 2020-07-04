package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fx */
public final class C8647fx implements C2265b<C8532bv> {
    /* renamed from: b */
    private static C8532bv m25947b(C2272g gVar) throws Exception {
        return m25946a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25947b(gVar);
    }

    /* renamed from: a */
    public static C8532bv m25946a(C2272g gVar) throws Exception {
        C8532bv bvVar = new C8532bv();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bvVar.f23457a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        bvVar.f23458b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bvVar.f23459c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bvVar;
            }
        }
    }
}
