package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.f */
public class C8623f extends C8538c implements C8455b {
    @C6593c(mo15949a = "msg")

    /* renamed from: a */
    public C8489ao f23602a;

    /* renamed from: b */
    public final boolean mo21629b() {
        return false;
    }

    public C8623f() {
        this.type = MessageType.BINDING_GIFT_MESSAGE;
    }

    /* renamed from: a */
    public final C8488an mo21628a() {
        if (this.f23602a != null) {
            return this.f23602a.mo21628a();
        }
        return null;
    }
}
