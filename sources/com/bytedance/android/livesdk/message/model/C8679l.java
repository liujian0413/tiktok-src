package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.l */
public class C8679l extends C8538c {
    @C6593c(mo15949a = "items")

    /* renamed from: a */
    public List<C8555cp> f23622a;
    @C6593c(mo15949a = "max_push_delay_time")

    /* renamed from: b */
    public long f23623b;

    public C8679l() {
        this.type = MessageType.CEREMONY_MESSAGE;
    }
}
