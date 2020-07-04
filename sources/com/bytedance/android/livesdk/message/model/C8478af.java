package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.af */
public class C8478af extends C8538c {
    @C6593c(mo15949a = "action")

    /* renamed from: a */
    public int f23209a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f23210b;
    @C6593c(mo15949a = "user")

    /* renamed from: c */
    public User f23211c;
    @C6593c(mo15949a = "upgrade_privilege")

    /* renamed from: d */
    public C8479a f23212d;

    /* renamed from: com.bytedance.android.livesdk.message.model.af$a */
    public static class C8479a {
        @C6593c(mo15949a = "content")

        /* renamed from: a */
        public String f23213a;
        @C6593c(mo15949a = "description")

        /* renamed from: b */
        public String f23214b;
        @C6593c(mo15949a = "button_type")

        /* renamed from: c */
        public int f23215c;
    }

    public boolean canText() {
        if (!C6319n.m19593a(this.f23210b)) {
            return true;
        }
        return false;
    }
}
