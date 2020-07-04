package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message.C9499a;
import com.p280ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.bytedance.android.livesdk.message.model.c */
public abstract class C8538c extends C9499a implements IMessage {
    public boolean isLocalInsertMsg;
    public boolean isTooMuchMsg;

    public int getPriority() {
        return 0;
    }

    public boolean supportDisplayText() {
        return false;
    }

    public int getIntType() {
        return this.type.getIntType();
    }

    public long getMessageId() {
        if (this.baseMessage != null) {
            return this.baseMessage.f25994d;
        }
        return 0;
    }

    public boolean needMonitor() {
        if (this.baseMessage == null || this.baseMessage.f25999i == 0) {
            return false;
        }
        return true;
    }
}
