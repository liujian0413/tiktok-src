package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cj */
public class C8548cj extends C8538c {
    @C6593c(mo15949a = "chat_id")

    /* renamed from: a */
    public long f23542a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23543b;
    @C6593c(mo15949a = "user")

    /* renamed from: c */
    public User f23544c;
    @C6593c(mo15949a = "screen_chat_type")

    /* renamed from: d */
    public int f23545d;
    @C6593c(mo15949a = "priority")

    /* renamed from: e */
    public int f23546e;
    @C6593c(mo15949a = "effect_v2")

    /* renamed from: f */
    public C8678k f23547f;
    @C6593c(mo15949a = "background_image_v2")

    /* renamed from: g */
    public ImageModel f23548g;

    public C8548cj() {
        this.type = MessageType.SCREEN;
    }

    /* renamed from: a */
    public final boolean mo21674a() {
        if (this.f23546e != 0) {
            return true;
        }
        return false;
    }

    public boolean canText() {
        if (this.f23544c == null || C6319n.m19593a(this.f23543b)) {
            return false;
        }
        return true;
    }
}
