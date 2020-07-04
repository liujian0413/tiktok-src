package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleTask_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.ev */
public final class C8618ev implements C2265b<C8504ba> {
    /* renamed from: b */
    private static C8504ba m25889b(C2272g gVar) throws Exception {
        return m25888a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25889b(gVar);
    }

    /* renamed from: a */
    private static C8504ba m25888a(C2272g gVar) throws Exception {
        C8504ba baVar = new C8504ba();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        baVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        baVar.f23299a = _BattleSetting_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        baVar.f23300b = _BattleMode_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        baVar.f23301c = _BattleTask_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return baVar;
            }
        }
    }
}
