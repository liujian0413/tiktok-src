package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.m */
public class C8680m extends C8538c {
    @C6593c(mo15949a = "chat_id")

    /* renamed from: a */
    public long f23624a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23625b;
    @C6593c(mo15949a = "user")

    /* renamed from: c */
    public User f23626c;
    @C6593c(mo15949a = "visible_to_sender")

    /* renamed from: d */
    public boolean f23627d;
    @C6593c(mo15949a = "background_image")

    /* renamed from: e */
    public ImageModel f23628e;
    @C6593c(mo15949a = "full_screen_text_color")

    /* renamed from: f */
    public String f23629f;

    /* renamed from: g */
    public transient String f23630g;

    public C8680m() {
        this.f23629f = "#FF0000";
        this.type = MessageType.CHAT;
    }

    public boolean canText() {
        if (this.f23626c == null || C6319n.m19593a(this.f23625b)) {
            return false;
        }
        return true;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
