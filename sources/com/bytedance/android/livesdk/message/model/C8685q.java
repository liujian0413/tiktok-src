package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.q */
public class C8685q extends C8538c {
    @C6593c(mo15949a = "schema_url")

    /* renamed from: a */
    public String f23653a;
    @C6593c(mo15949a = "anchor_pop_up")

    /* renamed from: b */
    public boolean f23654b;

    public C8685q() {
        this.type = MessageType.COMMON_POPUP_MESSAGE;
    }
}
