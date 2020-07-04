package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.core.utils.C3358ac;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.l */
public final class C4914l {
    @C6593c(mo15949a = "type")

    /* renamed from: a */
    public int f14046a;
    @C6593c(mo15949a = "level")

    /* renamed from: b */
    public long f14047b;
    @C6593c(mo15949a = "status")

    /* renamed from: c */
    public int f14048c;
    @C6593c(mo15949a = "total_days")

    /* renamed from: d */
    public long f14049d;
    @C6593c(mo15949a = "current_period")

    /* renamed from: e */
    public C4915a f14050e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.l$a */
    public static class C4915a {
        @C6593c(mo15949a = "expire_at")

        /* renamed from: a */
        public long f14051a;
        @C6593c(mo15949a = "started_at")

        /* renamed from: b */
        public long f14052b;
    }

    /* renamed from: a */
    public final String mo12894a() {
        int i = this.f14046a;
        return C3358ac.m12515a((int) R.string.ete);
    }
}
