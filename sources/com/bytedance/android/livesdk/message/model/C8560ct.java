package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.http.legacy.p877d.C19576d;

/* renamed from: com.bytedance.android.livesdk.message.model.ct */
public class C8560ct extends C8538c {
    @C6593c(mo15949a = "rcmd_goods_id")

    /* renamed from: a */
    public long f23593a;

    public C8560ct() {
        this.type = MessageType.RECOMMEND_GOODS;
    }

    public int hashCode() {
        return C19576d.m64494a(17, (Object) Long.valueOf(this.baseMessage.f25994d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8560ct) || this.baseMessage.f25994d != ((C8560ct) obj).baseMessage.f25994d) {
            return false;
        }
        return true;
    }
}
