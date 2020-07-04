package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.o */
public class C8682o extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23633a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23634b;
    @C6593c(mo15949a = "color")

    /* renamed from: c */
    public String f23635c;
    @C6593c(mo15949a = "back_ground")

    /* renamed from: d */
    public ImageModel f23636d;
    @C6593c(mo15949a = "action_type")

    /* renamed from: e */
    public long f23637e;
    @C6593c(mo15949a = "action_content")

    /* renamed from: f */
    public String f23638f;

    public boolean canText() {
        return true;
    }

    public C8682o() {
        this.type = MessageType.COMMENT_IMAGE;
    }
}
