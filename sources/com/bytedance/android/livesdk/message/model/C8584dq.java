package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2270e;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import com.google.gson.p277b.C6597a;

/* renamed from: com.bytedance.android.livesdk.message.model.dq */
public final class C8584dq implements C2265b<C8691v> {
    /* renamed from: b */
    private static C8691v m25827b(C2272g gVar) throws Exception {
        return m25826a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25827b(gVar);
    }

    /* renamed from: a */
    private static C8691v m25826a(C2272g gVar) throws Exception {
        C8691v vVar = new C8691v();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        vVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        vVar.f23679a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        vVar.f23683e = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        vVar.f23680b = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        vVar.f23684f = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        vVar.f23685g = (C8692w) C2270e.m9767a(C2273h.m9787e(gVar), new C6597a<C8692w>() {
                        }.type);
                        break;
                    case 8:
                        vVar.f23691m = C2273h.m9787e(gVar);
                        break;
                    case 9:
                        vVar.f23682d = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        vVar.f23687i = (int) C2273h.m9785c(gVar);
                        break;
                    case 11:
                        vVar.f23688j = C2273h.m9787e(gVar);
                        break;
                    case 12:
                        vVar.f23681c = C2273h.m9787e(gVar);
                        break;
                    case 13:
                        vVar.f23689k = C2273h.m9785c(gVar);
                        break;
                    case 14:
                        vVar.f23690l = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return vVar;
            }
        }
    }
}
