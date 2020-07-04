package com.bytedance.android.livesdk.message.p408b;

import com.bytedance.android.livesdk.message.model.C8538c;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.message.b.c */
public final class C8459c implements IInterceptor {

    /* renamed from: a */
    private long f23150a;

    public C8459c(long j) {
        this.f23150a = j;
    }

    public final boolean onMessage(IMessage iMessage) {
        C8538c cVar = (C8538c) iMessage;
        if (cVar.baseMessage == null || cVar.baseMessage.f25993c == this.f23150a) {
            return false;
        }
        return true;
    }
}
