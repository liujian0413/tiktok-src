package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cn */
public class C8553cn extends C8538c {
    @C6593c(mo15949a = "burst_time_remain_seconds")

    /* renamed from: a */
    public long f23572a;
    @C6593c(mo15949a = "multiple")

    /* renamed from: b */
    public long f23573b;
    @C6593c(mo15949a = "property_icon")

    /* renamed from: c */
    public ImageModel f23574c;
    @C6593c(mo15949a = "property_definition_id")

    /* renamed from: d */
    public long f23575d;

    public C8553cn() {
        this.type = MessageType.TURN_TABLE_BURST;
    }
}
