package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.df */
public final class C8573df implements C2265b<C8680m> {
    /* renamed from: b */
    private static C8680m m25805b(C2272g gVar) throws Exception {
        return m25804a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25805b(gVar);
    }

    /* renamed from: a */
    private static C8680m m25804a(C2272g gVar) throws Exception {
        C8680m mVar = new C8680m();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        mVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        mVar.f23626c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        mVar.f23625b = C2273h.m9787e(gVar);
                        break;
                    case 4:
                        mVar.f23627d = C2273h.m9783a(gVar);
                        break;
                    case 5:
                        mVar.f23628e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        mVar.f23629f = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return mVar;
            }
        }
    }
}
