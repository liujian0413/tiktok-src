package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ah */
public class C8481ah extends C8538c {
    @C6593c(mo15949a = "duration")

    /* renamed from: a */
    public long f23218a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23219b;
    @C6593c(mo15949a = "avatar_url")

    /* renamed from: c */
    public ImageModel f23220c;
    @C6593c(mo15949a = "gift_id")

    /* renamed from: d */
    public long f23221d;
    @C6593c(mo15949a = "hour_rank_info")

    /* renamed from: e */
    public String f23222e;

    public C8481ah() {
        this.f23218a = 4000;
        this.type = MessageType.FOLLOW_GUIDE;
    }

    public boolean canText() {
        if (!C6319n.m19593a(this.f23219b)) {
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
