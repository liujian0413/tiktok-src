package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ax */
public class C8498ax extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23285a;
    @C6593c(mo15949a = "pre_level")

    /* renamed from: b */
    public int f23286b;
    @C6593c(mo15949a = "current_level")

    /* renamed from: c */
    public int f23287c;

    /* renamed from: d */
    public transient boolean f23288d;

    public C8498ax() {
        this.f23286b = 3;
        this.f23287c = 4;
        this.type = MessageType.HONOR_LEVEL_UP;
    }
}
