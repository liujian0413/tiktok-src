package com.bytedance.android.livesdk.chatroom.model.p219a;

import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.e */
public final class C4854e {

    /* renamed from: a */
    public int f13868a;
    @C6593c(mo15949a = "fan_ticket")

    /* renamed from: b */
    public long f13869b;
    @C6593c(mo15949a = "linkmic_id")

    /* renamed from: c */
    public int f13870c;
    @C6593c(mo15949a = "user")

    /* renamed from: d */
    public User f13871d;
    @C6593c(mo15949a = "modify_time")

    /* renamed from: e */
    public long f13872e;
    @C6593c(mo15949a = "link_status")

    /* renamed from: f */
    public int f13873f;
    @C6593c(mo15949a = "link_type")

    /* renamed from: g */
    public int f13874g;
    @C6593c(mo15949a = "role_type")

    /* renamed from: h */
    public int f13875h;
    @C6593c(mo15949a = "payed_money")

    /* renamed from: i */
    public int f13876i;
    @C6593c(mo15949a = "link_duration")

    /* renamed from: j */
    public int f13877j;
    @C6593c(mo15949a = "user_position")

    /* renamed from: k */
    public int f13878k;
    @C6593c(mo15949a = "silence_status")

    /* renamed from: l */
    public int f13879l;

    /* renamed from: m */
    public boolean f13880m;

    /* renamed from: n */
    public boolean f13881n;

    /* renamed from: a */
    public final void mo12880a(C4854e eVar) {
        if (eVar != null && this.f13871d.getId() == eVar.f13871d.getId()) {
            if (eVar.f13869b > this.f13869b) {
                this.f13869b = eVar.f13869b;
            }
            this.f13870c = eVar.f13870c;
            this.f13871d = eVar.f13871d;
            if (eVar.f13872e > this.f13872e) {
                this.f13872e = eVar.f13872e;
            }
            this.f13873f = eVar.f13873f;
            this.f13874g = eVar.f13874g;
            this.f13875h = eVar.f13875h;
            this.f13876i = eVar.f13876i;
        }
    }
}
