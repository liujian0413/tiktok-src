package com.p280ss.android.ugc.aweme.friends.p1282b;

import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.friends.b.a */
public final class C30036a {

    /* renamed from: a */
    private final SharedPreferences f79010a;

    /* renamed from: com.ss.android.ugc.aweme.friends.b.a$a */
    static class C30038a {

        /* renamed from: a */
        public static C30036a f79011a = new C30036a();
    }

    /* renamed from: b */
    public static C30036a m98493b() {
        return C30038a.f79011a;
    }

    /* renamed from: a */
    public final String mo76281a() {
        return this.f79010a.getString("contact_invited", "");
    }

    /* renamed from: c */
    public final int mo76284c() {
        return this.f79010a.getInt("send_sms_strategy", 0);
    }

    private C30036a() {
        this.f79010a = C7285c.m22838a(AwemeApplication.m21341a(), "invite_settings", 0);
    }

    /* renamed from: a */
    public final void mo76282a(int i) {
        this.f79010a.edit().putInt("send_sms_strategy", i).apply();
    }

    /* renamed from: a */
    public final void mo76283a(String str) {
        this.f79010a.edit().putString("contact_invited", str).apply();
    }
}
