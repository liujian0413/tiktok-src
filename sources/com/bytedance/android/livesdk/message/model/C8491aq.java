package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.aq */
public class C8491aq extends C8538c {
    @C6593c(mo15949a = "msg_type")

    /* renamed from: a */
    public long f23268a;
    @C6593c(mo15949a = "vote_id")

    /* renamed from: b */
    public long f23269b;
    @C6593c(mo15949a = "results")

    /* renamed from: c */
    public List<C8492ar> f23270c;
    @C6593c(mo15949a = "finish_time")

    /* renamed from: d */
    public long f23271d;

    public C8491aq() {
        this.type = MessageType.GIFT_VOTE_MESSAGE;
    }
}
