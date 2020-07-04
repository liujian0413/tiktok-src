package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.adapter.C3881d;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.rank.model.f */
public class C8857f implements C3881d<C8857f> {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f24097a;
    @C6593c(mo15949a = "score")

    /* renamed from: b */
    public long f24098b;
    @C6593c(mo15949a = "rank")

    /* renamed from: c */
    public int f24099c;
    @C6593c(mo15949a = "gap_description")

    /* renamed from: d */
    public String f24100d;
    @C6593c(mo15949a = "delta")

    /* renamed from: e */
    public long f24101e;
    @C6593c(mo15949a = "rich_description")

    /* renamed from: f */
    public String f24102f;
    @C6593c(mo15949a = "city_code")

    /* renamed from: g */
    public String f24103g;
    @C6593c(mo15949a = "gap_rich_description")

    /* renamed from: h */
    public String f24104h;

    /* renamed from: i */
    public transient boolean f24105i;

    /* renamed from: j */
    public transient boolean f24106j;

    /* renamed from: a */
    public final long mo21920a() {
        if (this.f24097a == null) {
            return 0;
        }
        return this.f24097a.getLiveRoomId();
    }

    public int hashCode() {
        int a = (((((int) (((long) (((int) this.f24098b) * 37)) + mo21920a())) * 37) + this.f24097a.hashCode()) * 37) + this.f24099c;
        if (this.f24100d != null) {
            return (a * 37) + this.f24100d.hashCode();
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean mo11422b(C8857f fVar) {
        return equals(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo11421a(C8857f fVar) {
        if (this.f24097a.getId() == fVar.f24097a.getId()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8857f)) {
            return false;
        }
        C8857f fVar = (C8857f) obj;
        long a = mo21920a();
        if (this.f24098b == fVar.f24098b && a == fVar.mo21920a() && this.f24099c == fVar.f24099c && this.f24097a.equals(fVar.f24097a) && this.f24100d != null) {
            return this.f24100d.equals(fVar.f24100d);
        }
        return true;
    }
}
