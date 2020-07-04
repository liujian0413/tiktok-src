package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bm */
public class C8518bm extends C8538c implements C8455b {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23414a;
    @C6593c(mo15949a = "open_url")

    /* renamed from: b */
    public String f23415b;
    @C6593c(mo15949a = "background_pop")

    /* renamed from: c */
    public ImageModel f23416c;
    @C6593c(mo15949a = "background_normal")

    /* renamed from: d */
    public ImageModel f23417d;
    @C6593c(mo15949a = "display_style")

    /* renamed from: e */
    public int f23418e;
    @C6593c(mo15949a = "priority")

    /* renamed from: f */
    public C8488an f23419f;

    /* renamed from: a */
    public final C8488an mo21628a() {
        return this.f23419f;
    }

    /* renamed from: b */
    public final boolean mo21629b() {
        return false;
    }

    public C8518bm() {
        this.type = MessageType.NOBLE_UPGRADE_MESSAGE;
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
