package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.at */
public class C8494at extends C8538c {
    @C6593c(mo15949a = "delete_msg_ids")

    /* renamed from: a */
    public List<Long> f23280a;

    public C8494at() {
        this.type = MessageType.IM_DELETE;
    }
}
