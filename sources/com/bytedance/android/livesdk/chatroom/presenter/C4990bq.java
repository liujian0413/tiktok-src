package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.view.C5372b;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bq */
public final class C4990bq implements OnMessageListener {

    /* renamed from: a */
    private C5372b f14218a;

    /* renamed from: a */
    public final void mo12993a() {
        if (C9038ag.m26996a() != null) {
            C9038ag.m26996a().removeMessageListener(this);
        }
        this.f14218a = null;
    }

    public final void onMessage(IMessage iMessage) {
        if (this.f14218a != null) {
            this.f14218a.mo13115a((C8538c) iMessage);
        }
    }

    /* renamed from: a */
    public final void mo12994a(C5372b bVar) {
        this.f14218a = bVar;
        IMessageManager a = C9038ag.m26996a();
        if (a != null) {
            a.addMessageListener(MessageType.MEMBER.getIntType(), this);
            a.addMessageListener(MessageType.ROOM_NOTIFY.getIntType(), this);
            a.addMessageListener(MessageType.REMIND.getIntType(), this);
            a.addMessageListener(MessageType.COMMON_TOAST.getIntType(), this);
            a.addMessageListener(MessageType.FOLLOW_GUIDE.getIntType(), this);
            a.addMessageListener(MessageType.GUIDE_MESSAGE.getIntType(), this);
            a.addMessageListener(MessageType.COMMON_GUIDE.getIntType(), this);
            a.addMessageListener(MessageType.CEREMONY_MESSAGE.getIntType(), this);
        }
    }
}
