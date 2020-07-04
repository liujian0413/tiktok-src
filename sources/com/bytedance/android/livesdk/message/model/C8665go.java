package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8551cm.C8552a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.go */
public final class C8665go implements C2265b<C8552a> {
    /* renamed from: b */
    private static C8552a m25981b(C2272g gVar) throws Exception {
        return m25980a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25981b(gVar);
    }

    /* renamed from: a */
    public static C8552a m25980a(C2272g gVar) throws Exception {
        C8552a aVar = new C8552a();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23557a = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f23558b = C2273h.m9784b(gVar);
                        break;
                    case 3:
                        aVar.f23559c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f23560d = (long) C2273h.m9784b(gVar);
                        break;
                    case 5:
                        aVar.f23561e = (long) C2273h.m9784b(gVar);
                        break;
                    case 6:
                        aVar.f23562f = C2273h.m9784b(gVar);
                        break;
                    case 7:
                        aVar.f23563g = C2273h.m9784b(gVar);
                        break;
                    case 8:
                        aVar.f23564h = C2273h.m9784b(gVar);
                        break;
                    case 9:
                        aVar.f23565i = C2273h.m9784b(gVar);
                        break;
                    case 10:
                        aVar.f23566j = C2273h.m9784b(gVar);
                        break;
                    case 11:
                        aVar.f23567k = C2273h.m9784b(gVar);
                        break;
                    case 12:
                        aVar.f23568l = C2273h.m9784b(gVar);
                        break;
                    case 13:
                        aVar.f23569m = C2273h.m9787e(gVar);
                        break;
                    case 14:
                        aVar.f23570n = C2273h.m9787e(gVar);
                        break;
                    case 15:
                        aVar.f23571o = C2273h.m9784b(gVar);
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
