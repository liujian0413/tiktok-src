package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import com.bytedance.android.p109c.p110a.p111a.C2272g;
import com.bytedance.android.p109c.p110a.p111a.C2273h;

/* renamed from: com.bytedance.android.livesdk.message.model.fc */
public final class C8626fc implements C2265b<LotteryEventMessage> {
    /* renamed from: b */
    private static LotteryEventMessage m25905b(C2272g gVar) throws Exception {
        return m25904a(gVar);
    }

    public final /* synthetic */ Object decode(C2272g gVar) throws Exception {
        return m25905b(gVar);
    }

    /* renamed from: a */
    private static LotteryEventMessage m25904a(C2272g gVar) throws Exception {
        LotteryEventMessage lotteryEventMessage = new LotteryEventMessage();
        long a = gVar.mo8056a();
        while (true) {
            int b = gVar.mo8059b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lotteryEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        lotteryEventMessage.lotteryId = C2273h.m9785c(gVar);
                        break;
                    case 3:
                        lotteryEventMessage.lotteryStatus = C2273h.m9784b(gVar);
                        break;
                    case 4:
                        lotteryEventMessage.lotteryStartTime = C2273h.m9785c(gVar);
                        break;
                    case 5:
                        lotteryEventMessage.lotteryDrawTime = C2273h.m9785c(gVar);
                        break;
                    case 6:
                        lotteryEventMessage.lotteryCurrentTime = C2273h.m9785c(gVar);
                        break;
                    case 7:
                        lotteryEventMessage.lotteryRulePageScheme = C2273h.m9787e(gVar);
                        break;
                    default:
                        C2273h.m9789g(gVar);
                        break;
                }
            } else {
                gVar.mo8058a(a);
                return lotteryEventMessage;
            }
        }
    }
}
