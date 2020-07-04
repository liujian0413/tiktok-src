package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.chatroom.view.C5371a;
import com.bytedance.android.livesdk.message.model.C8688t;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.i */
public final class C5024i implements OnMessageListener {

    /* renamed from: a */
    private C5371a f14290a;

    /* renamed from: b */
    private DataCenter f14291b;

    /* renamed from: c */
    private IMessageManager f14292c;

    /* renamed from: a */
    public final void mo13038a() {
        if (this.f14292c != null) {
            this.f14292c.removeMessageListener(this);
        }
        this.f14290a = null;
    }

    public C5024i(DataCenter dataCenter) {
        this.f14291b = dataCenter;
    }

    /* renamed from: a */
    public final void mo13039a(C5371a aVar) {
        this.f14290a = aVar;
        this.f14292c = (IMessageManager) this.f14291b.get("data_message_manager");
        if (this.f14292c != null) {
            this.f14292c.addMessageListener(MessageType.CONTROL.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (this.f14290a != null) {
            this.f14290a.mo13116a((C8688t) iMessage);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(((C8688t) iMessage).f23670a));
        C3172e.m12001a("ttlive_control_message_status", 1, (Map<String, Object>) hashMap);
    }
}
