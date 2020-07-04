package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.C4895ba;
import com.bytedance.android.livesdk.chatroom.model.C4898bd;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fd */
public final class C8627fd implements C2265b<C8512bh> {
    /* renamed from: b */
    private static C8512bh m25907b(C2272g gVar) throws Exception {
        return m25906a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25907b(gVar);
    }

    /* renamed from: a */
    private static C8512bh m25906a(C2272g gVar) throws Exception {
        C8512bh bhVar = new C8512bh();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bhVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bhVar.f23368g = (int) C2273h.m9785c(gVar);
                        break;
                    case 3:
                        bhVar.f23363b = C2273h.m9785c(gVar);
                        break;
                    case 4:
                        bhVar.f23364c = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        bhVar.f23365d = (int) C2273h.m9785c(gVar);
                        break;
                    case 6:
                        bhVar.f23366e = (int) C2273h.m9785c(gVar);
                        break;
                    case 7:
                        bhVar.f23367f = C2273h.m9787e(gVar);
                        break;
                    case 8:
                        bhVar.f23370i = C2273h.m9783a(gVar);
                        break;
                    case 9:
                        bhVar.f23372k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        bhVar.f23373l = C2273h.m9783a(gVar);
                        break;
                    case 11:
                        bhVar.f23369h = (int) C2273h.m9785c(gVar);
                        break;
                    case 12:
                        bhVar.f23362a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 13:
                        if (bhVar.f23371j == null) {
                            bhVar.f23371j = new ArrayList();
                        }
                        bhVar.f23371j.add(C4895ba.m15884a(gVar));
                        break;
                    case 14:
                        bhVar.f23374m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 15:
                        bhVar.f23376o = C2273h.m9785c(gVar);
                        break;
                    case 16:
                        bhVar.f23377p = C2273h.m9784b(gVar);
                        break;
                    case 17:
                        bhVar.f23378q = C2273h.m9784b(gVar);
                        break;
                    case 18:
                        bhVar.f23379r = C2273h.m9784b(gVar);
                        break;
                    case 19:
                        bhVar.f23375n = C4898bd.m15890a(gVar);
                        break;
                    case 20:
                        bhVar.f23382u = C8649fz.m25950a(gVar);
                        break;
                    case 21:
                        bhVar.f23381t = C2273h.m9785c(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return bhVar;
            }
        }
    }
}
