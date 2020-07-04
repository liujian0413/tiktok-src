package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9358b;
import com.bytedance.android.livesdkapi.depend.model.live.C9362e;
import com.bytedance.android.livesdkapi.depend.model.live.C9364g;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ba */
public class C8504ba extends C8538c {
    @C6593c(mo15949a = "battle_settings")

    /* renamed from: a */
    public C9362e f23299a;
    @C6593c(mo15949a = "battle_mode")

    /* renamed from: b */
    public C9358b f23300b;
    @C6593c(mo15949a = "battle_task")

    /* renamed from: c */
    public C9364g f23301c;

    public C8504ba() {
        this.type = MessageType.LINK_MIC_BATTLE;
    }
}
