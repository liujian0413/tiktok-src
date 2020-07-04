package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cq */
public class C8556cq extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23583a;
    @C6593c(mo15949a = "user_id")

    /* renamed from: b */
    public long f23584b;
    @C6593c(mo15949a = "action_type")

    /* renamed from: c */
    public long f23585c;

    public C8556cq() {
        this.type = MessageType.USER_STATS;
    }
}
