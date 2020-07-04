package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bg */
public class C8511bg extends C8538c {
    @C6593c(mo15949a = "promotion_id")

    /* renamed from: a */
    long f23355a;
    @C6593c(mo15949a = "msg_type")

    /* renamed from: b */
    int f23356b;
    @C6593c(mo15949a = "target_uid")

    /* renamed from: c */
    List<Long> f23357c;
    @C6593c(mo15949a = "sec_target_uid")

    /* renamed from: d */
    List<String> f23358d;
    @C6593c(mo15949a = "bubble_type")

    /* renamed from: e */
    int f23359e;
    @C6593c(mo15949a = "screenshot_timestamp")

    /* renamed from: f */
    long f23360f;
    @C6593c(mo15949a = "ecom_notice")

    /* renamed from: g */
    String f23361g;

    /* renamed from: a */
    private int m25755a() {
        return this.f23356b;
    }

    public C8511bg() {
        this.type = MessageType.LIVE_SHOPPING;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("msgType:");
        sb.append(m25755a());
        return sb.toString();
    }
}
