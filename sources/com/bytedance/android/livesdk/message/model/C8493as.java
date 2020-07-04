package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.as */
public class C8493as extends C8538c {
    @C6593c(mo15949a = "guide_type")

    /* renamed from: a */
    public long f23276a;
    @C6593c(mo15949a = "gift_id")

    /* renamed from: b */
    public long f23277b;
    @C6593c(mo15949a = "description")

    /* renamed from: c */
    public String f23278c;
    @C6593c(mo15949a = "duration")

    /* renamed from: d */
    public long f23279d;

    public C8493as() {
        this.type = MessageType.GUIDE_MESSAGE;
    }
}
