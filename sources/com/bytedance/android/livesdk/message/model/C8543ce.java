package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ce */
public class C8543ce extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23516a;

    public C8543ce() {
        this.type = MessageType.ROOM;
    }

    public boolean canText() {
        if (!C6319n.m19593a(this.f23516a)) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
