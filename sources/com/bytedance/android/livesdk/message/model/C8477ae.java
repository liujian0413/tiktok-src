package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ae */
public class C8477ae extends C8538c {
    @C6593c(mo15949a = "speedy_gift_id")

    /* renamed from: a */
    public int f23202a;
    @C6593c(mo15949a = "target_score")

    /* renamed from: b */
    public int f23203b;
    @C6593c(mo15949a = "stage_count")

    /* renamed from: c */
    public int f23204c;
    @C6593c(mo15949a = "status")

    /* renamed from: d */
    public int f23205d;
    @C6593c(mo15949a = "score")

    /* renamed from: e */
    public int f23206e;
    @C6593c(mo15949a = "contribute_most")

    /* renamed from: f */
    public User f23207f;
    @C6593c(mo15949a = "duty_id")

    /* renamed from: g */
    public long f23208g;

    public C8477ae() {
        this.type = MessageType.DUTY_GIFT_MESSAGE;
    }
}
