package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.user.f */
public class C2374f {
    @C6593c(mo15949a = "icon")

    /* renamed from: a */
    public ImageModel f7818a;
    @C6593c(mo15949a = "level")

    /* renamed from: b */
    public long f7819b;

    public int hashCode() {
        int i;
        if (this.f7818a != null) {
            i = this.f7818a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + ((int) (this.f7819b ^ (this.f7819b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2374f fVar = (C2374f) obj;
        if (this.f7819b != fVar.f7819b) {
            return false;
        }
        if (this.f7818a != null) {
            return this.f7818a.equals(fVar.f7818a);
        }
        if (fVar.f7818a == null) {
            return true;
        }
        return false;
    }
}
