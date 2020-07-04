package com.bytedance.android.live.base.model.user;

import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.user.b */
public class C2370b {
    @C6593c(mo15949a = "level")

    /* renamed from: a */
    public long f7794a;
    @C6593c(mo15949a = "type")

    /* renamed from: b */
    public long f7795b;

    public int hashCode() {
        return (((int) (this.f7794a ^ (this.f7794a >>> 32))) * 31) + ((int) (this.f7795b ^ (this.f7795b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2370b bVar = (C2370b) obj;
        if (this.f7794a == bVar.f7794a && this.f7795b == bVar.f7795b) {
            return true;
        }
        return false;
    }
}
