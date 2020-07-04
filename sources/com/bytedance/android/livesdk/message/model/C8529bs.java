package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bs */
public class C8529bs extends C8538c {
    @C6593c(mo15949a = "action_content")

    /* renamed from: a */
    public String f23446a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23447b;
    @C6593c(mo15949a = "target_num")

    /* renamed from: c */
    public int f23448c;
    @C6593c(mo15949a = "show_num")

    /* renamed from: d */
    public int f23449d;
    @C6593c(mo15949a = "is_finished")

    /* renamed from: e */
    public boolean f23450e;
    @C6593c(mo15949a = "adcard_type")

    /* renamed from: f */
    public int f23451f;
    @C6593c(mo15949a = "hotvalue")

    /* renamed from: g */
    public int f23452g;

    public boolean canText() {
        return true;
    }

    public C8529bs() {
        this.f23451f = 1;
        this.type = MessageType.PROMOTION_CARD_MESSAGE;
    }

    /* renamed from: a */
    public final boolean mo21667a() {
        if (this.f23450e || this.f23449d >= this.f23448c) {
            return true;
        }
        return false;
    }
}
