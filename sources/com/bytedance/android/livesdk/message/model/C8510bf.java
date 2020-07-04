package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bf */
public class C8510bf extends C8538c {
    @C6593c(mo15949a = "msg_type")

    /* renamed from: a */
    public int f23347a;
    @C6593c(mo15949a = "nick_name")

    /* renamed from: b */
    public String f23348b;
    @C6593c(mo15949a = "purchase_cnt")

    /* renamed from: c */
    public long f23349c;
    @C6593c(mo15949a = "text")

    /* renamed from: d */
    public String f23350d;
    @C6593c(mo15949a = "icon")

    /* renamed from: e */
    public String f23351e;
    @C6593c(mo15949a = "meta_id")

    /* renamed from: f */
    public long f23352f;
    @C6593c(mo15949a = "server_time")

    /* renamed from: g */
    public long f23353g;
    @C6593c(mo15949a = "countdown")

    /* renamed from: h */
    public long f23354h;

    public C8510bf() {
        this.type = MessageType.LIVE_ECOM_MESSAGE;
    }
}
