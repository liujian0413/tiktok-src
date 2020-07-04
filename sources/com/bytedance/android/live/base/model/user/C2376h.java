package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.user.h */
public class C2376h {
    @C6593c(mo15949a = "level_str")

    /* renamed from: a */
    public String f7823a;
    @C6593c(mo15949a = "icon_diamond")

    /* renamed from: b */
    public int f7824b;
    @C6593c(mo15949a = "icon")

    /* renamed from: c */
    public ImageModel f7825c;
    @C6593c(mo15949a = "level")

    /* renamed from: d */
    public int f7826d;

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f7823a != null) {
            i = this.f7823a.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.f7824b) * 31;
        if (this.f7825c != null) {
            i2 = this.f7825c.hashCode();
        }
        return ((i3 + i2) * 31) + this.f7826d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2376h hVar = (C2376h) obj;
        if (this.f7824b != hVar.f7824b || this.f7826d != hVar.f7826d) {
            return false;
        }
        if (this.f7823a == null ? hVar.f7823a != null : !this.f7823a.equals(hVar.f7823a)) {
            return false;
        }
        if (this.f7825c != null) {
            return this.f7825c.equals(hVar.f7825c);
        }
        if (hVar.f7825c == null) {
            return true;
        }
        return false;
    }
}
