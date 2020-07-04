package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bl */
public class C8517bl extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23412a;
    @C6593c(mo15949a = "toast_icon")

    /* renamed from: b */
    public ImageModel f23413b;

    public C8517bl() {
        this.type = MessageType.NOBLE_TOAST_MESSAGE;
    }

    public boolean canText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
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
