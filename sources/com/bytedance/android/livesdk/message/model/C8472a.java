package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C8455b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.a */
public class C8472a extends C8538c implements C8455b {
    @C6593c(mo15949a = "asset_id")

    /* renamed from: a */
    public long f23186a;
    @C6593c(mo15949a = "panel_display_text")

    /* renamed from: b */
    public C9505f f23187b;
    @C6593c(mo15949a = "show_message")

    /* renamed from: c */
    public boolean f23188c;
    @C6593c(mo15949a = "show_panel")

    /* renamed from: d */
    public boolean f23189d;
    @C6593c(mo15949a = "user")

    /* renamed from: e */
    public User f23190e;
    @C6593c(mo15949a = "to_user")

    /* renamed from: f */
    public User f23191f;
    @C6593c(mo15949a = "priority")

    /* renamed from: g */
    public C8488an f23192g;

    /* renamed from: a */
    public final C8488an mo21628a() {
        return this.f23192g;
    }

    /* renamed from: b */
    public final boolean mo21629b() {
        return false;
    }

    public C8472a() {
        this.type = MessageType.ASSET_MESSAGE;
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
