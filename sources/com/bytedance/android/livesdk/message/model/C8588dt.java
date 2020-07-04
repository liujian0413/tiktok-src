package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2270e;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import com.google.gson.p277b.C6597a;

/* renamed from: com.bytedance.android.livesdk.message.model.dt */
public final class C8588dt implements C2265b<C8696z> {
    /* renamed from: b */
    private static C8696z m25833b(C2272g gVar) throws Exception {
        return m25832a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25833b(gVar);
    }

    /* renamed from: a */
    private static C8696z m25832a(C2272g gVar) throws Exception {
        C8696z zVar = new C8696z();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        zVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        zVar.f23702c = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        zVar.f23704e = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        zVar.f23700a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        zVar.f23701b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        zVar.f23706g = (C8473aa) C2270e.m9767a(C2273h.m9787e(gVar), new C6597a<C8473aa>() {
                        }.type);
                        break;
                    case 7:
                        zVar.f23705f = C2273h.m9785c(gVar);
                        break;
                    case 8:
                        zVar.f23707h = C8604eh.m25860a(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return zVar;
            }
        }
    }
}
