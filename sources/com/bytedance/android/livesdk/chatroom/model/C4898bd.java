package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bd */
public final class C4898bd implements C2265b<C4873ah> {
    /* renamed from: b */
    private static C4873ah m15891b(C2272g gVar) throws Exception {
        return m15890a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m15891b(gVar);
    }

    /* renamed from: a */
    public static C4873ah m15890a(C2272g gVar) throws Exception {
        C4873ah ahVar = new C4873ah();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ahVar.f13941a = C2273h.m9787e(gVar);
                        break;
                    case 2:
                        ahVar.f13942b = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        ahVar.f13944d = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        ahVar.f13943c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        ahVar.f13945e = C2273h.m9787e(gVar);
                        break;
                    case 6:
                        ahVar.f13946f = C2273h.m9787e(gVar);
                        break;
                    case 7:
                        ahVar.f13947g = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        ahVar.f13948h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        ahVar.f13949i = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return ahVar;
            }
        }
    }
}
