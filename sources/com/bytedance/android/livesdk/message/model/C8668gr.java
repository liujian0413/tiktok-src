package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.gr */
public final class C8668gr implements C2265b<C8554co> {
    /* renamed from: b */
    private static C8554co m25987b(C2272g gVar) throws Exception {
        return m25986a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25987b(gVar);
    }

    /* renamed from: a */
    private static C8554co m25986a(C2272g gVar) throws Exception {
        C8554co coVar = new C8554co();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        coVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        coVar.f23576a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        coVar.f23577b = C2273h.m9784b(gVar);
                        break;
                    case 4:
                        coVar.f23578c = C2273h.m9784b(gVar);
                        break;
                    case 5:
                        coVar.f23579d = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return coVar;
            }
        }
    }
}
