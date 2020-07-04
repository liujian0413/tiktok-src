package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gc */
public final class C8653gc implements C2265b<C8540cb> {
    /* renamed from: b */
    private static C8540cb m25957b(C2272g gVar) throws Exception {
        return m25956a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25957b(gVar);
    }

    /* renamed from: a */
    private static C8540cb m25956a(C2272g gVar) throws Exception {
        C8540cb cbVar = new C8540cb();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cbVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cbVar.f23494a = C2273h.m9787e(gVar);
                        break;
                    case 3:
                        cbVar.f23495b = (int) C2273h.m9785c(gVar);
                        break;
                    case 4:
                        cbVar.f23496c = C2273h.m9787e(gVar);
                        break;
                    case 5:
                        cbVar.f23497d = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        cbVar.f23498e = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        cbVar.f23499f = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        cbVar.f23500g = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        cbVar.f23501h = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return cbVar;
            }
        }
    }
}
