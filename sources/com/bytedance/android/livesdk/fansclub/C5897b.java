package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.message.model.C8478af;
import com.bytedance.android.livesdk.message.model.C8480ag;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.fansclub.b */
public final class C5897b extends C5017ci<C5899a> implements OnMessageListener {

    /* renamed from: com.bytedance.android.livesdk.fansclub.b$a */
    public interface C5899a extends C5595at {
        /* renamed from: a */
        void mo14434a(FansclubStatisticMessage fansclubStatisticMessage);

        /* renamed from: a */
        void mo14435a(C8478af afVar);

        /* renamed from: a */
        void mo14436a(C8480ag agVar);
    }

    /* renamed from: a */
    public final void mo9142a(C5899a aVar) {
        super.mo9142a(aVar);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.FANS_CLUB_STATISTICS.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.FANS_CLUB.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.FANS_CLUB_REVIEW.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            C8538c cVar = (C8538c) iMessage;
            switch (cVar.getMessageType()) {
                case FANS_CLUB_STATISTICS:
                    ((C5899a) mo9140c()).mo14434a((FansclubStatisticMessage) iMessage);
                    return;
                case FANS_CLUB:
                    C8478af afVar = (C8478af) iMessage;
                    if (afVar.f23209a == 2) {
                        ((C5899a) mo9140c()).mo14435a(afVar);
                        return;
                    }
                    break;
                case FANS_CLUB_REVIEW:
                    ((C5899a) mo9140c()).mo14436a((C8480ag) iMessage);
                    break;
            }
        }
    }
}
