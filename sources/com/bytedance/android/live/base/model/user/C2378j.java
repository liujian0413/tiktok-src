package com.bytedance.android.live.base.model.user;

import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.user.j */
public class C2378j {
    @C6593c(mo15949a = "is_muted")

    /* renamed from: a */
    public boolean f7829a;
    @C6593c(mo15949a = "is_admin")

    /* renamed from: b */
    public boolean f7830b;
    @C6593c(mo15949a = "is_super_admin")

    /* renamed from: c */
    public boolean f7831c;

    public int hashCode() {
        return ((this.f7829a ? 1 : 0) * true) + (this.f7830b ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2378j jVar = (C2378j) obj;
        if (this.f7829a == jVar.f7829a && this.f7830b == jVar.f7830b) {
            return true;
        }
        return false;
    }
}
