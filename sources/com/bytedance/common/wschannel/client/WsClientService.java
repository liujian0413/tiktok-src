package com.bytedance.common.wschannel.client;

import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.C9752a;
import com.bytedance.common.wschannel.model.WsChannelMsg;

public class WsClientService extends AbsWsClientService {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24271a(WsChannelMsg wsChannelMsg) {
        super.mo24271a(wsChannelMsg);
        if (wsChannelMsg != null) {
            try {
                C9752a listener = WsConstants.getListener(wsChannelMsg.f26776k);
                if (listener != null) {
                    listener.mo24157a(wsChannelMsg);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
