package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8556cq;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p346io.reactivex.C47557ad;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cb */
public final class C5008cb extends C10291b<C10290a> implements OnMessageListener {

    /* renamed from: a */
    private IMessageManager f14252a;

    /* renamed from: b */
    private DataCenter f14253b;

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14252a != null) {
            this.f14252a.removeMessageListener(this);
        }
    }

    public C5008cb(DataCenter dataCenter) {
        this.f14253b = dataCenter;
    }

    /* renamed from: a */
    public final void mo9142a(C10290a aVar) {
        super.mo9142a(aVar);
        this.f14252a = (IMessageManager) this.f14253b.get("data_message_manager");
        if (this.f14252a != null) {
            this.f14252a.addMessageListener(MessageType.USER_STATS.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            C8556cq cqVar = (C8556cq) iMessage;
            if (cqVar != null && cqVar.f23584b == TTLiveSDKContext.getHostService().mo22367h().mo22179b() && 1 == cqVar.f23585c) {
                TTLiveSDKContext.getHostService().mo22367h().mo22185e().mo19137b((C47557ad<? super T>) new C8986g<Object>());
                this.f14253b.lambda$put$1$DataCenter("cmd_refresh_user_in_room", new Object());
            }
        }
    }
}
