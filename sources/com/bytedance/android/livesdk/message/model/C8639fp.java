package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8522bp.C8526d;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fp */
public final class C8639fp implements C2265b<C8526d> {
    /* renamed from: b */
    private static C8526d m25931b(C2272g gVar) throws Exception {
        return m25930a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25931b(gVar);
    }

    /* renamed from: a */
    public static C8526d m25930a(C2272g gVar) throws Exception {
        C8526d dVar = new C8526d();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f23435a = C2273h.m9785c(gVar);
                        break;
                    case 2:
                        dVar.f23436b = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        dVar.f23437c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        dVar.f23438d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return dVar;
            }
        }
    }
}
