package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.alibaba.fastjson.JSON;
import com.p280ss.android.websocket.internal.C45439a;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.d */
public final class C34330d implements C7305b {
    /* renamed from: a */
    public final Object mo18093a(C45439a aVar) {
        Object obj;
        Class cls = null;
        for (C34328b a : C34331e.m111025a().f89477a) {
            cls = a.mo87070a(aVar.getMethod());
            if (cls != null) {
                break;
            }
        }
        if (cls == null) {
            return null;
        }
        try {
            obj = JSON.parseObject(new String(aVar.getPayload()), cls);
        } catch (Throwable unused) {
            obj = null;
        }
        return obj;
    }
}
