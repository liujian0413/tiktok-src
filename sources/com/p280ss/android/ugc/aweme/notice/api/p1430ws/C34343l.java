package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.p280ss.android.websocket.internal.C45439a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.l */
public final class C34343l implements C45439a {

    /* renamed from: a */
    public final WsChannelMsg f89506a;

    public final int getMethod() {
        return this.f89506a.f26770e;
    }

    public final long getSeqId() {
        return this.f89506a.f26767b;
    }

    public final int getService() {
        return this.f89506a.f26769d;
    }

    public final byte[] getPayload() {
        byte[] a = this.f89506a.mo24357a();
        C7573i.m23582a((Object) a, "wsChannelMsg.payload");
        return a;
    }

    public final String getPayloadEncoding() {
        String str = this.f89506a.f26772g;
        C7573i.m23582a((Object) str, "wsChannelMsg.payloadEncoding");
        return str;
    }

    public final String getPayloadType() {
        String str = this.f89506a.f26773h;
        C7573i.m23582a((Object) str, "wsChannelMsg.payloadType");
        return str;
    }

    public C34343l(WsChannelMsg wsChannelMsg) {
        C7573i.m23587b(wsChannelMsg, "wsChannelMsg");
        this.f89506a = wsChannelMsg;
    }
}
