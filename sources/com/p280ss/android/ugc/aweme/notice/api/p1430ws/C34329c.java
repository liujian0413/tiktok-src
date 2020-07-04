package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.alibaba.fastjson.JSON;
import com.p280ss.android.ugc.aweme.notice.api.bean.LiveMessage;
import com.p280ss.android.websocket.internal.C45439a;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.c */
public final class C34329c implements C7305b {
    /* renamed from: a */
    public final Object mo18093a(C45439a aVar) {
        try {
            return JSON.parseObject(new String(aVar.getPayload()), LiveMessage.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
